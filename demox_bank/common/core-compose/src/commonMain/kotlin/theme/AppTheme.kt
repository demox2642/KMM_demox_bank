package theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember

object AppTheme {

    val colors: AppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

//    val typography: AppTypography
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalTypography.current

    @Composable
    fun AppTheme(
        colors: AppColors = AppTheme.colors,
        // typography: AppTypography = AppTheme.typography,
        content: @Composable () -> Unit
    ) {
        val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }
        CompositionLocalProvider(
            LocalColors provides rememberedColors
            //   LocalTypography provides typography
        ) {
            content()
        }
    }
}
