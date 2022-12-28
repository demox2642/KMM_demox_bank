package ru.demox_bank.utils

import kotlinx.serialization.Serializable

@Serializable
data class Response<T : Any>(
    val success: Boolean,
    val response: T? = null,
    val error: ResponseError? = null
) {
    val isSuccess
        get() = success
}
