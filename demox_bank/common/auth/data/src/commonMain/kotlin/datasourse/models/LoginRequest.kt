package datasourse.models

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequest(
    val phone: Long,
    val password: String
)
