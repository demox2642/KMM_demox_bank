package repository

import models.AuthResponce
import models.ConfirmCode

interface AuthRepository {

    suspend fun register(phone: Long, password: String): AuthResponce<ConfirmCode>
}
