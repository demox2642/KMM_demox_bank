package com.bank_test_backend.database.conf_code_cache

import ru.demox_bank.utils.Response
import ru.demox_bank.utils.ResponseDB
import ru.demox_bank.utils.ResponseError
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction

object ConfCodeCache : Table("conf_user_code_cache") {
    private val id = ConfCodeCache.long("id").autoIncrement()
    private val userId = ConfCodeCache.long("user_id")
    private val code = ConfCodeCache.long("conf_code")

    fun insertConfCodeCache(confCodeCacheDTO: ConfCodeCacheDTO): ResponseDB {
        return try {
            transaction {
                ConfCodeCache.insert {
                    it[userId] = confCodeCacheDTO.userId
                    it[code] = confCodeCacheDTO.code
                }
                ResponseDB.Success(data = null)
            }
        } catch (e: Exception) {
            ResponseDB.Failed(message = e.message!!)
        }
    }

    fun deleteConfCodeCache(userId: Long): ResponseDB {
        return try {
            transaction {
                ConfCodeCache.deleteWhere { ConfCodeCache.userId.eq(userId) }
                ResponseDB.Success(data = null)
            }
        } catch (e: Exception) {
            ResponseDB.Failed(message = e.message!!)
        }
    }

    fun getConfCode(userId: Long): Response<ConfirmCodeDTO> {
        return try {
            transaction {
                val confCodeCash = ConfCodeCache.select { ConfCodeCache.userId.eq(userId) }.single()
                Response(
                    success = true,
                    response = ConfirmCodeDTO(
                        code = confCodeCash[code]
                    )
                )
            }
        } catch (e: Exception) {
            Response(success = false, error = ResponseError(errorCode = 62, errorMessage = e.message.toString()))
        }
    }

    fun getConfCodeCache(userId: Long): Response<ConfCodeCacheDTO> {
        return try {
            transaction {
                val confCodeCash = ConfCodeCache.select { ConfCodeCache.userId.eq(userId) }.single()
                Response(
                    success = true,
                    response = ConfCodeCacheDTO(
                        id = confCodeCash[ConfCodeCache.id],
                        userId = confCodeCash[ConfCodeCache.userId],
                        code = confCodeCash[code]
                    )
                )
            }
        } catch (e: Exception) {
            Response(success = false, error = ResponseError(errorCode = 62, errorMessage = e.message.toString()))
        }
    }

    fun checkConfCode(code: Long): Response<ConfCodeCacheDTO> {
        return try {
            transaction {
                val confCodeCash = ConfCodeCache.select { ConfCodeCache.code.eq(code) }.single()
                Response(
                    success = true,
                    response = ConfCodeCacheDTO(
                        id = confCodeCash[ConfCodeCache.id],
                        userId = confCodeCash[userId],
                        code = confCodeCash[ConfCodeCache.code]
                    )
                )
            }
        } catch (e: Exception) {
            Response(success = false, error = ResponseError(errorCode = 90, errorMessage = e.message.toString()))
        }
    }
}
