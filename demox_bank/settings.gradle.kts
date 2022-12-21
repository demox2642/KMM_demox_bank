pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
rootProject.name = "demox_bank"

include(":android")
include(":desktop")

include(":common:main:api")
include(":common:main:presentation")
include(":common:main:data")
include(":common:main:compose")

include(":common:auth:api")
include(":common:auth:presentation")
include(":common:auth:data")
include(":common:auth:compose")

include(":common:invest:api")
include(":common:invest:presentation")
include(":common:invest:data")
include(":common:invest:compose")

include(":common:remittance:api")
include(":common:remittance:presentation")
include(":common:remittance:data")
include(":common:remittance:compose")

include(":common:chat:api")
include(":common:chat:presentation")
include(":common:chat:data")
include(":common:chat:compose")

include(":common:service:api")
include(":common:service:presentation")
include(":common:service:data")
include(":common:service:compose")

include(":common:core")
include(":common:core-compose")
include(":common:core-utils")

// include(":common:umbrella-ios")
include(":common:umbrella-compose")
include(":common:umbrella-core")
include("server")
