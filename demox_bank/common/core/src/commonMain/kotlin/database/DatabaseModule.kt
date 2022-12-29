package database

import org.kodein.di.DI

internal val databaseModule = DI.Module("databaseModule") {
//    bind<DbDriverFactory>() with singleton {
//        DbDriverFactory(instance())
//    }
}
