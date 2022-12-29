package models

import kotlinx.serialization.Serializable

@Serializable
data class AuthResponce<T>(
    val response: T,
    val success: Boolean
)
