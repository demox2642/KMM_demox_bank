package ru.demox_bank.plugins // ktlint-disable filename

import io.ktor.serialization.kotlinx.json.* // ktlint-disable no-wildcard-imports
import io.ktor.server.application.* // ktlint-disable no-wildcard-imports
import io.ktor.server.plugins.* // ktlint-disable no-wildcard-imports

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}
