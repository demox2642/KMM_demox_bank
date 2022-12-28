package ru.demox_bank.features.register.model

import kotlinx.serialization.Serializable

@Serializable
data class RegisterReceiveRemote(
    val phone: Long,
    val password: String
)
