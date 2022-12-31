package theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

class AppColors(
    systemTextPrimary: Color,
    systemTextSecondary: Color,
    systemTextTertiary: Color,
    systemTextOnPrimary: Color,

    controlTextBlue: Color,
    controlTextBlueActive: Color,
    controlTextBlueDark: Color,

    colorTextAlert: Color,
    colorTextSuccess: Color,
    colorTextAqua: Color,
    colorTextCaution: Color,
    colorTextWarning: Color,
    colorTextIndigo: Color,
    colorTextPink: Color,

    systemGraphPrimary: Color,
    systemGraphSecondary: Color,
    systemGraphTertiary: Color,
    systemGraphLine: Color,
    systemGraphOnPrimary: Color,

    controlGraphBlue: Color,
    controlGraphBlueActive: Color,
    controlGraphBlueDark: Color,
    controlGraphDisable: Color,

    colorGraphAlert: Color,
    colorGraphSuccess: Color,
    colorGraphAqua: Color,
    colorGraphCaution: Color,
    colorGraphWarning: Color,
    colorGraphIndigo: Color,
    colorGraphPink: Color,

    systemBackgroundPrimary: Color,
    systemBackgroundSecondary: Color,
    systemBackgroundTertiary: Color,

    colorBackgroundAlert: Color,
    colorBackgroundSuccess: Color,
    colorBackgroundLightBlue: Color,
    colorBackgroundCaution: Color,
    colorBackgroundWarning: Color,
    colorBackgroundIndigo: Color,
    colorBackgroundPink: Color,
    isLight: Boolean

) {
    var systemTextPrimary by mutableStateOf(systemTextPrimary)
        private set
    var systemTextSecondary by mutableStateOf(systemTextSecondary)
        private set
    var systemTextTertiary by mutableStateOf(systemTextTertiary)
        private set
    var systemTextOnPrimary by mutableStateOf(systemTextOnPrimary)
        private set

    var controlTextBlue by mutableStateOf(controlTextBlue)
        private set
    var controlTextBlueActive by mutableStateOf(controlTextBlueActive)
        private set
    var controlTextBlueDark by mutableStateOf(controlTextBlueDark)
        private set

    var colorTextAlert by mutableStateOf(colorTextAlert)
        private set
    var colorTextSuccess by mutableStateOf(colorTextSuccess)
        private set
    var colorTextAqua by mutableStateOf(colorTextAqua)
        private set
    var colorTextCaution by mutableStateOf(colorTextCaution)
        private set
    var colorTextWarning by mutableStateOf(colorTextWarning)
        private set
    var colorTextIndigo by mutableStateOf(colorTextIndigo)
        private set
    var colorTextPink by mutableStateOf(colorTextPink)
        private set

    var systemGraphPrimary by mutableStateOf(systemGraphPrimary)
        private set
    var systemGraphSecondary by mutableStateOf(systemGraphSecondary)
        private set
    var systemGraphTertiary by mutableStateOf(systemGraphTertiary)
        private set
    var systemGraphLine by mutableStateOf(systemGraphLine)
        private set
    var systemGraphOnPrimary by mutableStateOf(systemGraphOnPrimary)
        private set

    var controlGraphBlue by mutableStateOf(controlGraphBlue)
        private set
    var controlGraphBlueActive by mutableStateOf(controlGraphBlueActive)
        private set
    var controlGraphBlueDark by mutableStateOf(controlGraphBlueDark)
        private set
    var controlGraphDisable by mutableStateOf(controlGraphDisable)
        private set

    var colorGraphAlert by mutableStateOf(colorGraphAlert)
        private set
    var colorGraphSuccess by mutableStateOf(colorGraphSuccess)
        private set
    var colorGraphAqua by mutableStateOf(colorGraphAqua)
        private set
    var colorGraphCaution by mutableStateOf(colorGraphCaution)
        private set
    var colorGraphWarning by mutableStateOf(colorGraphWarning)
        private set
    var colorGraphIndigo by mutableStateOf(colorGraphIndigo)
        private set
    var colorGraphPink by mutableStateOf(colorGraphPink)
        private set

    var systemBackgroundPrimary by mutableStateOf(systemBackgroundPrimary)
        private set
    var systemBackgroundSecondary by mutableStateOf(systemBackgroundSecondary)
        private set
    var systemBackgroundTertiary by mutableStateOf(systemBackgroundTertiary)
        private set

    var colorBackgroundAlert by mutableStateOf(colorBackgroundAlert)
        private set
    var colorBackgroundSuccess by mutableStateOf(colorBackgroundSuccess)
        private set
    var colorBackgroundLightBlue by mutableStateOf(colorBackgroundLightBlue)
        private set
    var colorBackgroundCaution by mutableStateOf(colorBackgroundCaution)
        private set
    var colorBackgroundWarning by mutableStateOf(colorBackgroundWarning)
        private set
    var colorBackgroundIndigo by mutableStateOf(colorBackgroundIndigo)
        private set
    var colorBackgroundPink by mutableStateOf(colorBackgroundPink)
        private set

    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        systemTextPrimary: Color = this.systemTextPrimary,
        systemTextSecondary: Color = this.systemTextSecondary,
        systemTextTertiary: Color = this.systemTextTertiary,
        systemTextOnPrimary: Color = this.systemTextOnPrimary,

        controlTextBlue: Color = this.controlTextBlue,
        controlTextBlueActive: Color = this.controlTextBlueActive,
        controlTextBlueDark: Color = this.controlTextBlueDark,

        colorTextAlert: Color = this.colorTextAlert,
        colorTextSuccess: Color = this.colorTextSuccess,
        colorTextAqua: Color = this.colorTextAqua,
        colorTextCaution: Color = this.colorTextCaution,
        colorTextWarning: Color = this.colorTextWarning,
        colorTextIndigo: Color = this.colorTextIndigo,
        colorTextPink: Color = this.colorTextPink,

        systemGraphPrimary: Color = this.systemGraphPrimary,
        systemGraphSecondary: Color = this.systemGraphSecondary,
        systemGraphTertiary: Color = this.systemGraphTertiary,
        systemGraphLine: Color = this.systemGraphLine,
        systemGraphOnPrimary: Color = this.systemGraphOnPrimary,

        controlGraphBlue: Color = this.controlGraphBlue,
        controlGraphBlueActive: Color = this.controlGraphBlueActive,
        controlGraphBlueDark: Color = this.controlGraphBlueDark,
        controlGraphDisable: Color = this.controlGraphDisable,

        colorGraphAlert: Color = this.colorGraphAlert,
        colorGraphSuccess: Color = this.colorGraphSuccess,
        colorGraphAqua: Color = this.colorGraphAqua,
        colorGraphCaution: Color = this.colorGraphCaution,
        colorGraphWarning: Color = this.colorGraphWarning,
        colorGraphIndigo: Color = this.colorGraphIndigo,
        colorGraphPink: Color = this.colorGraphPink,

        systemBackgroundPrimary: Color = this.systemBackgroundPrimary,
        systemBackgroundSecondary: Color = this.systemBackgroundSecondary,
        systemBackgroundTertiary: Color = this.systemBackgroundTertiary,

        colorBackgroundAlert: Color = this.colorBackgroundAlert,
        colorBackgroundSuccess: Color = this.colorBackgroundSuccess,
        colorBackgroundLightBlue: Color = this.colorBackgroundLightBlue,
        colorBackgroundCaution: Color = this.colorBackgroundCaution,
        colorBackgroundWarning: Color = this.colorBackgroundWarning,
        colorBackgroundIndigo: Color = this.colorBackgroundIndigo,
        colorBackgroundPink: Color = this.colorBackgroundPink,
        isLight: Boolean = this.isLight
    ): AppColors = AppColors(
        systemTextPrimary,
        systemTextSecondary,
        systemTextTertiary,
        systemTextOnPrimary,

        controlTextBlue,
        controlTextBlueActive,
        controlTextBlueDark,

        colorTextAlert,
        colorTextSuccess,
        colorTextAqua,
        colorTextCaution,
        colorTextWarning,
        colorTextIndigo,
        colorTextPink,

        systemGraphPrimary,
        systemGraphSecondary,
        systemGraphTertiary,
        systemGraphLine,
        systemGraphOnPrimary,

        controlGraphBlue,
        controlGraphBlueActive,
        controlGraphBlueDark,
        controlGraphDisable,

        colorGraphAlert,
        colorGraphSuccess,
        colorGraphAqua,
        colorGraphCaution,
        colorGraphWarning,
        colorGraphIndigo,
        colorGraphPink,

        systemBackgroundPrimary,
        systemBackgroundSecondary,
        systemBackgroundTertiary,

        colorBackgroundAlert,
        colorBackgroundSuccess,
        colorBackgroundLightBlue,
        colorBackgroundCaution,
        colorBackgroundWarning,
        colorBackgroundIndigo,
        colorBackgroundPink,
        isLight
    )

    fun updateColorsFrom(other: AppColors) {
        systemTextPrimary = other.systemTextPrimary
        systemTextSecondary = other.systemTextSecondary
        systemTextTertiary = other.systemTextTertiary
        systemTextOnPrimary = other.systemTextOnPrimary

        controlTextBlue = other.controlTextBlue
        controlTextBlueActive = other.controlTextBlueActive
        controlTextBlueDark = other.controlTextBlueDark

        colorTextAlert = other.colorTextAlert
        colorTextSuccess = other.colorTextSuccess
        colorTextAqua = other.colorTextAqua
        colorTextCaution = other.colorTextCaution
        colorTextWarning = other.colorTextWarning
        colorTextIndigo = other.colorTextIndigo
        colorTextPink = other.colorTextPink

        systemGraphPrimary = other.systemGraphPrimary
        systemGraphSecondary = other.systemGraphSecondary
        systemGraphTertiary = other.systemGraphTertiary
        systemGraphLine = other.systemGraphLine
        systemGraphOnPrimary = other.systemGraphOnPrimary

        controlGraphBlue = other.controlGraphBlue
        controlGraphBlueActive = other.controlGraphBlueActive
        controlGraphBlueDark = other.controlGraphBlueDark
        controlGraphDisable = other.controlGraphDisable

        colorGraphAlert = other.colorGraphAlert
        colorGraphSuccess = other.colorGraphSuccess
        colorGraphAqua = other.colorGraphAqua
        colorGraphCaution = other.colorGraphCaution
        colorGraphWarning = other.colorGraphWarning
        colorGraphIndigo = other.colorGraphIndigo
        colorGraphPink = other.colorGraphPink

        systemBackgroundPrimary = other.systemBackgroundPrimary
        systemBackgroundSecondary = other.systemBackgroundSecondary
        systemBackgroundTertiary = other.systemBackgroundTertiary

        colorBackgroundAlert = other.colorBackgroundAlert
        colorBackgroundSuccess = other.colorBackgroundSuccess
        colorBackgroundLightBlue = other.colorBackgroundLightBlue
        colorBackgroundCaution = other.colorBackgroundCaution
        colorBackgroundWarning = other.colorBackgroundWarning
        colorBackgroundIndigo = other.colorBackgroundIndigo
        colorBackgroundPink = other.colorBackgroundPink
    }
}

private val SystemTextPrimary = Color(0xFF1B1D21)
private val SystemTextSecondary = Color(0xFF5E6775)
private val SystemTextTertiary = Color(0xFFD3D6DD)
private val SystemTextOnPrimary = Color(0xFFFFFFFF)

private val SystemTextDarkPrimary = Color(0xFFF8F8F8)
private val SystemTextDarkSecondary = Color(0xFF989DA5)
private val SystemTextDarkTertiary = Color(0xFF75777C)
private val SystemTextDarkOnPrimary = Color(0xFFFFFFFF)

private val ControlTextBlue = Color(0xFF355DFF)
private val ControlTextBlueActive = Color(0xFFF9F9FA)
private val ControlTextBlueDark = Color(0xFF14297A)

private val ControlTextDarkBlue = Color(0xFF355DFF)
private val ControlTextDarkBlueActive = Color(0xFFF9F9FA)
private val ControlTextDarkBlueDark = Color(0xFF14297A)

private val ColorTextAlert = Color(0xFFEF4444)
private val ColorTextSuccess = Color(0xFF26B16E)
private val ColorTextAqua = Color(0xFF18BCF2)
private val ColorTextCaution = Color(0xFFF2C94C)
private val ColorTextWarning = Color(0xFFFF8C19)
private val ColorTextIndigo = Color(0xFF5C2EE6)
private val ColorTextPink = Color(0xFF5C2EE6)

private val ColorTextDarkAlert = Color(0xFFEF4444)
private val ColorTextDarkSuccess = Color(0xFF26B16E)
private val ColorTextDarkAqua = Color(0xFF18BCF2)
private val ColorTextDarkCaution = Color(0xFFF2C94C)
private val ColorTextDarkWarning = Color(0xFFFF8C19)
private val ColorTextDarkIndigo = Color(0xFF5C2EE6)
private val ColorTextDarkPink = Color(0xFF5C2EE6)

private val SystemGraphPrimary = Color(0xFF1B1D21)
private val SystemGraphSecondary = Color(0xFF5E6775)
private val SystemGraphTertiary = Color(0xFFD3D6DD)
private val SystemGraphLine = Color(0xFFF3F4F6)
private val SystemGraphOnPrimary = Color(0xFFFFFFFF)

private val SystemGraphDarkPrimary = Color(0xFFF8F8F8)

private val SystemGraphDarkSecondary = Color(0xFF989DA5)
private val SystemGraphDarkTertiary = Color(0xFF75777C)
private val SystemGraphDarkLine = Color(0xFF2D313D)
private val SystemGraphDarkOnPrimary = Color(0xFFFFFFFF)

private val ControlGraphBlue = Color(0xFF355DFF)
private val ControlGraphBlueActive = Color(0xFF103DF2)
private val ControlGraphBlueDark = Color(0xFF14317A)
private val ControlGraphDisable = Color(0xFFDCDFE5)

private val ControlGraphDarkBlue = Color(0xFF355DFF)
private val ControlGraphDarkBlueActive = Color(0xFF103DF2)
private val ControlGraphDarkBlueDark = Color(0xFF14297A)
private val ControlGraphDarkDisable = Color(0xFF343B49)

private val ColorGraphAlert = Color(0xFFEF4444)
private val ColorGraphSuccess = Color(0xFF26B16E)
private val ColorGraphAqua = Color(0xFF18BCF2)
private val ColorGraphCaution = Color(0xFFF2C94C)
private val ColorGraphWarning = Color(0xFFFF8C19)
private val ColorGraphIndigo = Color(0xFF5C2EE6)
private val ColorGraphPink = Color(0xFF5C2EE6)

private val ColorGraphDarkAlert = Color(0xFFEF4444)
private val ColorGraphDarkSuccess = Color(0xFF26B16E)
private val ColorGraphDarkAqua = Color(0xFF18BCF2)
private val ColorGraphDarkCaution = Color(0xFFF2C94C)
private val ColorGraphDarkWarning = Color(0xFFFF8C19)
private val ColorGraphDarkIndigo = Color(0xFF5C2EE6)
private val ColorGraphDarkPink = Color(0xFF5C2EE6)

private val SystemBackgroundPrimary = Color(0xFFFFFFFF)
private val SystemBackgroundSecondary = Color(0xFFF8F8F8)
private val SystemBackgroundTertiary = Color(0xFFE9EBF0)

private val SystemBackgroundDarkPrimary = Color(0xFF1E1F28)
private val SystemBackgroundDarkSecondary = Color(0xFF323842)
private val SystemBackgroundDarkTertiary = Color(0xFF4A5260)

private val ColorBackgroundAlert = Color(0xFFFFE8E8)
private val ColorBackgroundSuccess = Color(0xFFE5F6EE)
private val ColorBackgroundLightBlue = Color(0xFFDBF0FF)
private val ColorBackgroundCaution = Color(0xFFFAFCDE)
private val ColorBackgroundWarning = Color(0xFFFFF6DB)
private val ColorBackgroundIndigo = Color(0xFFECE8FF)
private val ColorBackgroundPink = Color(0xFFFFE5F2)

private val ColorBackgroundDarkAlert = Color(0xFFFFCACA)
private val ColorBackgroundDarkSuccess = Color(0xFFA9D9C2)
private val ColorBackgroundDarkLightBlue = Color(0xFFB7DAF3)
private val ColorBackgroundDarkCaution = Color(0xFFFEF8BF)
private val ColorBackgroundDarkWarning = Color(0xFFFBEAB9)
private val ColorBackgroundDarkIndigo = Color(0xFFDED7FE)
private val ColorBackgroundDarkPink = Color(0xFFFCD7E9)

fun appLightColors(
    systemTextPrimary: Color = SystemTextPrimary,
    systemTextSecondary: Color = SystemTextSecondary,
    systemTextTertiary: Color = SystemTextTertiary,
    systemTextOnPrimary: Color = SystemTextOnPrimary,

    controlTextBlue: Color = ControlTextBlue,
    controlTextBlueActive: Color = ControlTextBlueActive,
    controlTextBlueDark: Color = ControlTextBlueDark,

    colorTextAlert: Color = ColorTextAlert,
    colorTextSuccess: Color = ColorTextSuccess,
    colorTextAqua: Color = ColorTextAqua,
    colorTextCaution: Color = ColorTextCaution,
    colorTextWarning: Color = ColorTextWarning,
    colorTextIndigo: Color = ColorTextIndigo,
    colorTextPink: Color = ColorTextPink,

    systemGraphPrimary: Color = SystemGraphPrimary,
    systemGraphSecondary: Color = SystemGraphSecondary,
    systemGraphTertiary: Color = SystemGraphTertiary,
    systemGraphLine: Color = SystemGraphLine,
    systemGraphOnPrimary: Color = SystemGraphOnPrimary,

    controlGraphBlue: Color = ControlGraphBlue,
    controlGraphBlueActive: Color = ControlGraphBlueActive,
    controlGraphBlueDark: Color = ControlGraphBlueDark,
    controlGraphDisable: Color = ControlGraphDisable,

    colorGraphAlert: Color = ColorGraphAlert,
    colorGraphSuccess: Color = ColorGraphSuccess,
    colorGraphAqua: Color = ColorGraphAqua,
    colorGraphCaution: Color = ColorGraphCaution,
    colorGraphWarning: Color = ColorGraphWarning,
    colorGraphIndigo: Color = ColorGraphIndigo,
    colorGraphPink: Color = ColorGraphPink,

    systemBackgroundPrimary: Color = SystemBackgroundPrimary,
    systemBackgroundSecondary: Color = SystemBackgroundSecondary,
    systemBackgroundTertiary: Color = SystemBackgroundTertiary,

    colorBackgroundAlert: Color = ColorBackgroundAlert,
    colorBackgroundSuccess: Color = ColorBackgroundSuccess,
    colorBackgroundLightBlue: Color = ColorBackgroundLightBlue,
    colorBackgroundCaution: Color = ColorBackgroundCaution,
    colorBackgroundWarning: Color = ColorBackgroundWarning,
    colorBackgroundIndigo: Color = ColorBackgroundIndigo,
    colorBackgroundPink: Color = ColorBackgroundPink

): AppColors = AppColors(
    systemTextPrimary = systemTextPrimary,
    systemTextSecondary = systemTextSecondary,
    systemTextTertiary = systemTextTertiary,
    systemTextOnPrimary = systemTextOnPrimary,

    controlTextBlue = controlTextBlue,
    controlTextBlueActive = controlTextBlueActive,
    controlTextBlueDark = controlTextBlueDark,

    colorTextAlert = colorTextAlert,
    colorTextSuccess = colorTextSuccess,
    colorTextAqua = colorTextAqua,
    colorTextCaution = colorTextCaution,
    colorTextWarning = colorTextWarning,
    colorTextIndigo = colorTextIndigo,
    colorTextPink = colorTextPink,

    systemGraphPrimary = systemGraphPrimary,
    systemGraphSecondary = systemGraphSecondary,
    systemGraphTertiary = systemGraphTertiary,
    systemGraphLine = systemGraphLine,
    systemGraphOnPrimary = systemGraphOnPrimary,

    controlGraphBlue = controlGraphBlue,
    controlGraphBlueActive = controlGraphBlueActive,
    controlGraphBlueDark = controlGraphBlueDark,
    controlGraphDisable = controlGraphDisable,

    colorGraphAlert = colorGraphAlert,
    colorGraphSuccess = colorGraphSuccess,
    colorGraphAqua = colorGraphAqua,
    colorGraphCaution = colorGraphCaution,
    colorGraphWarning = colorGraphWarning,
    colorGraphIndigo = colorGraphIndigo,
    colorGraphPink = colorGraphPink,

    systemBackgroundPrimary = systemBackgroundPrimary,
    systemBackgroundSecondary = systemBackgroundSecondary,
    systemBackgroundTertiary = systemBackgroundTertiary,

    colorBackgroundAlert = colorBackgroundAlert,
    colorBackgroundSuccess = colorBackgroundSuccess,
    colorBackgroundLightBlue = colorBackgroundLightBlue,
    colorBackgroundCaution = colorBackgroundCaution,
    colorBackgroundWarning = colorBackgroundWarning,
    colorBackgroundIndigo = colorBackgroundIndigo,
    colorBackgroundPink = colorBackgroundPink,

    isLight = true
)

fun appDarkColors(
    systemTextPrimary: Color = SystemTextDarkPrimary,
    systemTextSecondary: Color = SystemTextDarkSecondary,
    systemTextTertiary: Color = SystemTextDarkTertiary,
    systemTextOnPrimary: Color = SystemTextDarkOnPrimary,

    controlTextBlue: Color = ControlTextDarkBlue,
    controlTextBlueActive: Color = ControlTextDarkBlueActive,
    controlTextBlueDark: Color = ControlTextDarkBlueDark,

    colorTextAlert: Color = ColorTextDarkAlert,
    colorTextSuccess: Color = ColorTextDarkSuccess,
    colorTextAqua: Color = ColorTextDarkAqua,
    colorTextCaution: Color = ColorTextDarkCaution,
    colorTextWarning: Color = ColorTextDarkWarning,
    colorTextIndigo: Color = ColorTextDarkIndigo,
    colorTextPink: Color = ColorTextDarkPink,

    systemGraphPrimary: Color = SystemGraphDarkPrimary,
    systemGraphSecondary: Color = SystemGraphDarkSecondary,
    systemGraphTertiary: Color = SystemGraphDarkTertiary,
    systemGraphLine: Color = SystemGraphDarkLine,
    systemGraphOnPrimary: Color = SystemGraphDarkOnPrimary,

    controlGraphBlue: Color = ControlGraphDarkBlue,
    controlGraphBlueActive: Color = ControlGraphDarkBlueActive,
    controlGraphBlueDark: Color = ControlGraphDarkBlueDark,
    controlGraphDisable: Color = ControlGraphDarkDisable,

    colorGraphAlert: Color = ColorGraphDarkAlert,
    colorGraphSuccess: Color = ColorGraphDarkSuccess,
    colorGraphAqua: Color = ColorGraphDarkAqua,
    colorGraphCaution: Color = ColorGraphDarkCaution,
    colorGraphWarning: Color = ColorGraphDarkWarning,
    colorGraphIndigo: Color = ColorGraphDarkIndigo,
    colorGraphPink: Color = ColorGraphDarkPink,

    systemBackgroundPrimary: Color = SystemBackgroundDarkPrimary,
    systemBackgroundSecondary: Color = SystemBackgroundDarkSecondary,
    systemBackgroundTertiary: Color = SystemBackgroundDarkTertiary,

    colorBackgroundAlert: Color = ColorBackgroundDarkAlert,
    colorBackgroundSuccess: Color = ColorBackgroundDarkSuccess,
    colorBackgroundLightBlue: Color = ColorBackgroundDarkLightBlue,
    colorBackgroundCaution: Color = ColorBackgroundDarkCaution,
    colorBackgroundWarning: Color = ColorBackgroundDarkWarning,
    colorBackgroundIndigo: Color = ColorBackgroundDarkIndigo,
    colorBackgroundPink: Color = ColorBackgroundDarkPink

): AppColors = AppColors(
    systemTextPrimary = systemTextPrimary,
    systemTextSecondary = systemTextSecondary,
    systemTextTertiary = systemTextTertiary,
    systemTextOnPrimary = systemTextOnPrimary,

    controlTextBlue = controlTextBlue,
    controlTextBlueActive = controlTextBlueActive,
    controlTextBlueDark = controlTextBlueDark,

    colorTextAlert = colorTextAlert,
    colorTextSuccess = colorTextSuccess,
    colorTextAqua = colorTextAqua,
    colorTextCaution = colorTextCaution,
    colorTextWarning = colorTextWarning,
    colorTextIndigo = colorTextIndigo,
    colorTextPink = colorTextPink,

    systemGraphPrimary = systemGraphPrimary,
    systemGraphSecondary = systemGraphSecondary,
    systemGraphTertiary = systemGraphTertiary,
    systemGraphLine = systemGraphLine,
    systemGraphOnPrimary = systemGraphOnPrimary,

    controlGraphBlue = controlGraphBlue,
    controlGraphBlueActive = controlGraphBlueActive,
    controlGraphBlueDark = controlGraphBlueDark,
    controlGraphDisable = controlGraphDisable,

    colorGraphAlert = colorGraphAlert,
    colorGraphSuccess = colorGraphSuccess,
    colorGraphAqua = colorGraphAqua,
    colorGraphCaution = colorGraphCaution,
    colorGraphWarning = colorGraphWarning,
    colorGraphIndigo = colorGraphIndigo,
    colorGraphPink = colorGraphPink,

    systemBackgroundPrimary = systemBackgroundPrimary,
    systemBackgroundSecondary = systemBackgroundSecondary,
    systemBackgroundTertiary = systemBackgroundTertiary,

    colorBackgroundAlert = colorBackgroundAlert,
    colorBackgroundSuccess = colorBackgroundSuccess,
    colorBackgroundLightBlue = colorBackgroundLightBlue,
    colorBackgroundCaution = colorBackgroundCaution,
    colorBackgroundWarning = colorBackgroundWarning,
    colorBackgroundIndigo = colorBackgroundIndigo,
    colorBackgroundPink = colorBackgroundPink,

    isLight = false
)

val LocalColors = staticCompositionLocalOf { appLightColors() }
