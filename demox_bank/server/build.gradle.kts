val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val exposed_version: String by project

plugins {
    application
    kotlin("jvm")
    kotlin("plugin.serialization")
}

group = "ru.demox_bank"
version = "0.0.1"

application {
    mainClass.set("ru.demox_bank.ApplicationKt")
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
}

dependencies {
    implementation(Dependencies.Ktor.server_core)
    implementation(Dependencies.Ktor.server_negotiation)
    implementation(Dependencies.Ktor.server_cio)
    implementation(Dependencies.Ktor.server_netty)
    implementation(Dependencies.Ktor.kotlin_json)

    implementation(Dependencies.Exposed.core)
    implementation(Dependencies.Exposed.dao)
    implementation(Dependencies.Exposed.jdbc)

    implementation(Dependencies.Postgresql.sql)

    implementation(Dependencies.Logback.logback)
    testImplementation(Dependencies.Ktor.server_test)
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

    implementation(Dependencies.Ktor.core)
    implementation(Dependencies.Ktor.cio)
    implementation(Dependencies.Ktor.logging)
}

tasks.create("stage") {
    dependsOn("installDist")
}
