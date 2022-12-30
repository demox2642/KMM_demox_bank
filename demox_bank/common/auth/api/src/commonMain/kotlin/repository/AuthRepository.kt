package repository

import models.AuthResponce
import models.ConfirmCode
import models.Token

interface AuthRepository {

    suspend fun register(phone: Long, password: String): AuthResponce<ConfirmCode>
    suspend fun confirmCode(code: Int): AuthResponce<Token>

    fun isUserLoggedIn(): Boolean
    suspend fun auth(phone: Long, password: String): AuthResponce<ConfirmCode>
}
