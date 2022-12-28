package ru.demox_bank.utils

import kotlinx.serialization.Serializable

@Serializable
sealed class ResponseDB {

    data class Success<T>(
        val data: T
    ) : ResponseDB()

    data class Failed(
        val message: String
    ) : ResponseDB()

    companion object {
        fun <T> success(data: T?) = Success(data)
        fun failed(message: String = "") = Failed(message)
    }
}
