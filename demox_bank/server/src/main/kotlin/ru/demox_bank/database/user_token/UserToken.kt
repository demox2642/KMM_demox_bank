package ru.demox_bank.database.user_token

import org.jetbrains.exposed.sql.* // ktlint-disable no-wildcard-imports
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.transactions.transaction
import ru.demox_bank.utils.Response
import ru.demox_bank.utils.ResponseDB
import ru.demox_bank.utils.ResponseError

object UserToken : Table("user_token") {
    private val id = UserToken.long("id").autoIncrement()
    private val userId = UserToken.long("user_id")
    private val token = UserToken.varchar("token", 50)
    private val confCodeId = UserToken.long("conf_code_id")

    fun insertToken(userTokenDTO: UserTokenDTO): ResponseDB {
        return try {
            transaction {
                UserToken.insert {
                    it[userId] = userTokenDTO.userId
                    it[token] = userTokenDTO.token
                    it[confCodeId] = userTokenDTO.confCodeId
                }
                ResponseDB.Success(data = null)
            }
        } catch (e: Exception) {
            ResponseDB.Failed(message = e.message!!)
        }
    }

    fun deleteToken(token: String): ResponseDB {
        return try {
            transaction {
                UserToken.deleteWhere { UserToken.token.eq(token) }
                ResponseDB.Success(data = null)
            }
        } catch (e: Exception) {
            ResponseDB.Failed(message = e.message!!)
        }
    }

    fun getTokenByToken(token: String): Response<UserTokenDTO> {
        return try {
            transaction {
                val token = UserToken.select { UserToken.token.eq(token) }.single()
                Response(
                    success = true,
                    response = UserTokenDTO(
                        id = null,
                        userId = token[userId],
                        token = token[UserToken.token],
                        confCodeId = token[confCodeId]
                    )
                )
            }
        } catch (e: Exception) {
            Response(success = false, error = ResponseError(errorCode = 62, errorMessage = e.message.toString()))
        }
    }

    fun getTokenByUserId(userId: Long): ResponseDB {
        return try {
            transaction {
                val token = UserToken.select { UserToken.userId.eq(userId) }.single()
                ResponseDB.Success(
                    data = UserTokenDTO(
                        id = null,
                        userId = token[UserToken.userId],
                        token = token[UserToken.token],
                        confCodeId = token[confCodeId]
                    )
                )
            }
        } catch (e: Exception) {
            ResponseDB.Failed(message = e.message!!)
        }
    }

    fun checkTokenByConfCode(confCodeId: Long): Boolean {
        return try {
            transaction {
                val tokenList = UserToken.select { UserToken.confCodeId.eq(confCodeId) }.firstOrNull()
                tokenList != null
            }
        } catch (e: Exception) {
            false
        }
    }
}
