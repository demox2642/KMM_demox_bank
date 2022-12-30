package datasourse

import datasourse.models.CodeRequest
import datasourse.models.LoginRequest
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import models.AuthResponce
import models.ConfirmCode
import models.Token

class AuthRemoteDataSource(
    private val httpClient: HttpClient
) {
    suspend fun register(loginRequest: LoginRequest): AuthResponce<ConfirmCode> {
        return httpClient.post {
            url {
                path("register")
                setBody(loginRequest)
            }
        }.body()
    }
    suspend fun confirmCode(codeRequest: CodeRequest): AuthResponce<Token> {
        return httpClient.post {
            url {
                path("register/conf_code")
                setBody(codeRequest)
            }
        }.body()
    }

    suspend fun auth(loginRequest: LoginRequest): AuthResponce<ConfirmCode> {
        return httpClient.post {
            url {
                path("auth")
                setBody(loginRequest)
            }
        }.body()
    }
}
