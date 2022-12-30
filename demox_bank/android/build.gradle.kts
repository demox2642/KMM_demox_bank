plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    kotlin("android")
}

group = "me.demox"
version = "1.0"

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common:core"))

    implementation(project(":common:umbrella-core"))
    implementation(project(":common:umbrella-compose"))

    implementation(Dependencies.Android.Compose.runtime)
    implementation(Dependencies.Android.Compose.ui)
    implementation(Dependencies.Android.Compose.material)
    implementation(Dependencies.Android.Compose.icons)
    implementation(Dependencies.Android.Compose.tooling)

    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.appcompat:appcompat:1.5.0")
}

android {
    namespace = "com.demox.bank"
    compileSdk = 32
    defaultConfig {
        applicationId = "com.demox.bank.android"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
