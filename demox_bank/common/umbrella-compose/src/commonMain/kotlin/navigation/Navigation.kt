package navigation // ktlint-disable filename

import SplashScreen
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.generateGraph(source: NavigationSource) {
    screen(name = NavigationTree.Splash.SplashScreen.name) {
        SplashScreen()
    }

    authFlow()

    when (source) {
        NavigationSource.Android -> {
        }

        NavigationSource.Desktop -> {
        }

        NavigationSource.IOS -> {}
    }
}
