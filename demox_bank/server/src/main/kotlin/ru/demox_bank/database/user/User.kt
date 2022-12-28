package ru.demox_bank.database.user // ktlint-disable package-name

import com.bank_test_backend.database.user.UserDTO
import com.bank_test_backend.database.user.UserIDDTO
import org.jetbrains.exposed.sql.* // ktlint-disable no-wildcard-imports
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.transactions.transaction
import ru.demox_bank.utils.Response
import ru.demox_bank.utils.ResponseDB
import ru.demox_bank.utils.ResponseError

object User : Table("users") {
    private val id = User.long("id").autoIncrement()
    private val phone = User.long("phone")
    private val password = User.varchar("password", 25)

    fun insertUser(userDTO: UserDTO): ResponseDB {
        return try {
            transaction {
                User.insert {
                    it[phone] = userDTO.phone
                    it[password] = userDTO.password
                }
            }
            ResponseDB.Success(data = true)
        } catch (e: Exception) {
            ResponseDB.Failed(message = e.message!!)
        }
    }

    fun getUserByPhone(phone: Long): Response<UserIDDTO> {
        return try {
            transaction {
                val user = User.select { User.phone.eq(phone) }.single()

                Response(
                    success = true,
                    response = UserIDDTO(
                        id = user[User.id]
                    )
                )
            }
        } catch (e: Exception) {
            Response(success = false, error = ResponseError(errorCode = 42, errorMessage = e.message.toString()))
        }
    }

    fun delUser(userId: Long) {
        transaction {
            User.deleteWhere { id.eq(userId) }
        }
    }

    fun getUserList(): Response<List<UserDTO>> {
        return transaction {
            val usersList = User.selectAll().toList()
            if (usersList.isNullOrEmpty()) {
                Response(
                    success = true,
                    response = emptyList()
                )
            } else {
                Response(
                    success = true,
                    response = usersList.map {
                        UserDTO(
                            phone = it[phone],
                            password = it[password]
                        )
                    }
                )
            }
        }
    }
}
