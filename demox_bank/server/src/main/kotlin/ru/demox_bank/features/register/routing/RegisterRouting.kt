package ru.demox_bank.features.register.routing // ktlint-disable filename

import io.ktor.server.application.* // ktlint-disable no-wildcard-imports
import io.ktor.server.routing.* // ktlint-disable no-wildcard-imports
import ru.demox_bank.features.register.controller.RegisterController

fun Application.configureRegisterRouting() {
    routing {
        post("/register") {
            val registerController = RegisterController(call)
            registerController.registerNewUser()
        }

        post("/register/conf_code") {
            val registerController = RegisterController(call)
            registerController.confirmCode()
        }
    }
}
