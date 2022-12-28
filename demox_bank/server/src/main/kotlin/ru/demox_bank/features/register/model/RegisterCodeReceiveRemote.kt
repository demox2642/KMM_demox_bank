package ru.demox_bank.features.register.model

import kotlinx.serialization.Serializable

@Serializable
data class RegisterCodeReceiveRemote(
    val code: Long
)
