package ru.demox_bank.utils

import java.io.IOException

sealed interface NetworkResponse<out T : Any> {
    /**
     * Success response with body
     */
    data class Success<T : Any>(val body: T) : NetworkResponse<T>

    sealed class Error : Exception(), NetworkResponse<Nothing> {
        /**
         * Failure response with body
         */
        data class ApiError(val body: Response<Any>, val code: Int) : Error()

        /**
         * Network error
         */
        data class NetworkError(val error: IOException) : Error()

        /**
         * For example, json parsing error
         */
        data class UnknownError(val error: Throwable?) : Error()
    }
}
