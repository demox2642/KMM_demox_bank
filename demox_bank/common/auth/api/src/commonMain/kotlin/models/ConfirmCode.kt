package models

import kotlinx.serialization.Serializable

@Serializable
data class ConfirmCode(
    val code: Int
)
