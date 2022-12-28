package ru.demox_bank.utils // ktlint-disable filename

import io.ktor.serialization.kotlinx.json.* // ktlint-disable no-wildcard-imports
import io.ktor.server.application.* // ktlint-disable no-wildcard-imports
import io.ktor.server.plugins.contentnegotiation.* // ktlint-disable no-wildcard-imports
import kotlinx.serialization.json.Json

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json(
            Json {
                ignoreUnknownKeys = true
            }
        )
    }
}
