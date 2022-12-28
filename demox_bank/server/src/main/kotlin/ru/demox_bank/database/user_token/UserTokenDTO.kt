package ru.demox_bank.database.user_token

import kotlinx.serialization.Serializable

@Serializable
class UserTokenDTO(
    val id: Long? = null,
    val userId: Long,
    val token: String,
    val confCodeId: Long
)
