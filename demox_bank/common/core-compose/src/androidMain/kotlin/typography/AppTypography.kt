package typography

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.demox.bank.core_compose.R

private val euclid_Circular_A_light = FontFamily(Font(R.font.euclid_circular_light, FontWeight.Light))
private val euclid_Circular_A_regular = FontFamily(Font(R.font.euclid_circular_regular, FontWeight.Normal))
private val euclid_Circular_A_medium = FontFamily(Font(R.font.euclid_circular_medium, FontWeight.Medium))
private val euclid_Circular_A_semibold = FontFamily(Font(R.font.euclid_circular_semibold, FontWeight.SemiBold))
private val euclid_Circular_A_bold = FontFamily(Font(R.font.euclid_circular_bold, FontWeight.Bold))

data class AppTypography(
    val h1: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_bold,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    val h2: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_bold,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    val h3: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_semibold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),
    val h4: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_semibold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    val h5: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_semibold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    val buttonM: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_semibold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    val buttonS: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_semibold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),
    val link: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_medium,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    val body: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_regular,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp
    ),
    val body0: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_regular,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    val body1: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_regular,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    val caption1: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_regular,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp
    ),
    val caption: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_medium,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    ),
    val label1: TextStyle = TextStyle(
        fontFamily = euclid_Circular_A_regular,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp
    )
)

internal val LocalTypography = staticCompositionLocalOf { AppTypography() }
