package ru.demox_bank.features.register.controller // ktlint-disable package-name

import com.bank_test_backend.database.conf_code_cache.ConfCodeCache
import com.bank_test_backend.database.conf_code_cache.ConfCodeCacheDTO
import com.bank_test_backend.database.user.UserDTO
import io.ktor.http.* // ktlint-disable no-wildcard-imports
import io.ktor.server.application.* // ktlint-disable no-wildcard-imports
import io.ktor.server.request.* // ktlint-disable no-wildcard-imports
import io.ktor.server.response.* // ktlint-disable no-wildcard-imports
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ru.demox_bank.database.user.User
import ru.demox_bank.database.user_token.UserToken
import ru.demox_bank.database.user_token.UserTokenDTO
import ru.demox_bank.features.register.model.RegisterCodeReceiveRemote
import ru.demox_bank.features.register.model.RegisterReceiveRemote
import ru.demox_bank.utils.Response
import ru.demox_bank.utils.ResponseError
import java.util.*
import kotlin.random.Random

class RegisterController(private val call: ApplicationCall) {

    suspend fun registerNewUser() {
        val registerReceiveRemote = call.receive<RegisterReceiveRemote>()

        if (User.getUserList().response.isNullOrEmpty() || User.getUserList().response!!.filter { it.phone == registerReceiveRemote.phone }.isNullOrEmpty()
        ) {
            try {
                User.insertUser(
                    UserDTO(
                        phone = registerReceiveRemote.phone,
                        password = registerReceiveRemote.password
                    )
                )
                val userId = User.getUserByPhone(registerReceiveRemote.phone).response!!
                ConfCodeCache.insertConfCodeCache(ConfCodeCacheDTO(userId = userId.id, code = Random.nextLong(100000, 999999)))
                call.respond(ConfCodeCache.getConfCode(userId.id))
                CoroutineScope(Dispatchers.IO).launch {
                    delay(35000L)

                    val token = ConfCodeCache.getConfCodeCache(userId = userId.id).response?.id
                    if (UserToken.checkTokenByConfCode(token!!).not()) {
                        ConfCodeCache.deleteConfCodeCache(userId = userId.id)
                        User.delUser(userId = userId.id)
                    }
                    ConfCodeCache.deleteConfCodeCache(userId = userId.id)
                }
            } catch (e: Exception) {
                call.respond(HttpStatusCode.BadRequest, "Can't create user $e")
            }
        } else {
            call.respond(
                Response<String>(
                    success = false,
                    error = ResponseError(errorCode = 63, errorMessage = "The server have user with phone  ${registerReceiveRemote.phone}")
                )
            )
        }
    }

    suspend fun confirmCode() {
        val confirmCodeReceiveRemote = call.receive<RegisterCodeReceiveRemote>()

        try {
            val checkConfCode = ConfCodeCache.checkConfCode(confirmCodeReceiveRemote.code)
            if (checkConfCode.success) {
                val token = UUID.randomUUID().toString()
                UserToken.insertToken(
                    UserTokenDTO(
                        userId = checkConfCode.response!!.userId,
                        token = token,
                        confCodeId = checkConfCode.response.id!!
                    )
                )
                call.respond(UserToken.getTokenByToken(token))
            }
        } catch (e: Exception) {
            call.respond(HttpStatusCode.BadRequest, "Code Error $e")
        }
    }
}
