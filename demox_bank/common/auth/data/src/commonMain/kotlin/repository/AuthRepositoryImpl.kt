package repository

import datasourse.AuthRemoteDataSource
import datasourse.models.CodeRequest
import datasourse.models.LoginRequest
import models.AuthResponce
import models.ConfirmCode
import models.Token
import settings.SettingsAuthDataSource

class AuthRepositoryImpl(
    private val remoteDataSource: AuthRemoteDataSource,
    private val cacheDataSource: SettingsAuthDataSource
) : AuthRepository {
    override suspend fun register(phone: Long, password: String): AuthResponce<ConfirmCode> {
        return remoteDataSource.register(
            loginRequest = LoginRequest(
                phone = phone,
                password = password
            )
        )
    }

    override suspend fun confirmCode(code: Int): AuthResponce<Token> {
        val token = remoteDataSource.confirmCode(
            codeRequest = CodeRequest(code)
        )
        if (token.success) {
            cacheDataSource.saveToken(token.response.token)
        }

        return token
    }

    override fun isUserLoggedIn(): Boolean {
        return cacheDataSource.fetchToken().isNotBlank()
    }

    override suspend fun auth(phone: Long, password: String): AuthResponce<ConfirmCode> {
        return remoteDataSource.auth(
            loginRequest = LoginRequest(
                phone = phone,
                password = password
            )
        )
    }
}
