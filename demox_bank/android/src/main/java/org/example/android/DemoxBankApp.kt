package org.example.android

import PlatformConfiguration
import android.app.Application

class DemoxBankApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initPlatformSDK()
    }
}

fun DemoxBankApp.initPlatformSDK() =
    PlatformSDK.init(
        configuration = PlatformConfiguration(androidContext = applicationContext)
    )
