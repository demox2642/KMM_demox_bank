package ru.demox_bank // ktlint-disable filename

import io.ktor.server.cio.* // ktlint-disable no-wildcard-imports
import io.ktor.server.engine.* // ktlint-disable no-wildcard-imports
import org.jetbrains.exposed.sql.Database
import ru.demox_bank.plugins.configureRouting

fun main() {
    Database.connect(
        "jdbc:postgresql://localhost:5432/playzone",
        driver = "org.postgresql.Driver",
        user = "postgres",
        password = "postgres"
    )

    embeddedServer(CIO, port = 8081, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
