package ru.demox_bank.plugins // ktlint-disable filename

import io.ktor.server.application.* // ktlint-disable no-wildcard-imports
import io.ktor.server.response.* // ktlint-disable no-wildcard-imports
import io.ktor.server.routing.* // ktlint-disable no-wildcard-imports

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello, World")
        }

        get("/test") {
            call.respondText("Test Hello World")
        }
    }
}
