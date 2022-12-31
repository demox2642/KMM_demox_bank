package typography

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.demox.bank.core_compose.R

val sfFontFamily = FontFamily(
    Font(R.font.sf_ultralight, FontWeight.Thin), // W100
    Font(R.font.sf_thin, FontWeight.ExtraLight), // W200
    Font(R.font.sf_light, FontWeight.Light), // W300
    Font(R.font.sf_regular, FontWeight.Normal), // W400
    Font(R.font.sf_medium, FontWeight.Medium), // W500
    Font(R.font.sf_semibold, FontWeight.SemiBold), // W600
    Font(R.font.sf_bold, FontWeight.Bold), // W700
    Font(R.font.sf_heavy, FontWeight.ExtraBold), // W800
    Font(R.font.sf_black, FontWeight.Black) // W900
)

val ecFontFamily = FontFamily(

    Font(R.font.euclid_circular_light, FontWeight.Light), // W300
    Font(R.font.euclid_circular_regular, FontWeight.Normal), // W400
    Font(R.font.euclid_circular_medium, FontWeight.Medium), // W500
    Font(R.font.euclid_circular_semibold, FontWeight.SemiBold), // W600
    Font(R.font.euclid_circular_bold, FontWeight.Bold) // W700

)
