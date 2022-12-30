package di

import datasourse.AuthRemoteDataSource
import org.kodein.di.*
import repository.AuthRepository
import repository.AuthRepositoryImpl
import settings.SettingsAuthDataSource

val authModule = DI.Module("authModule") {
    bind<AuthRepository>() with singleton {
        AuthRepositoryImpl(instance(), instance())
    }

    bind<SettingsAuthDataSource>() with provider {
        SettingsAuthDataSource(instance())
    }

    bind<AuthRemoteDataSource>() with provider {
        AuthRemoteDataSource(instance())
    }
}
