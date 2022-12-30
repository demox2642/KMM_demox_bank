package login.models

sealed class LoginEvent {
    data class PhoneChanged(val value: String) : LoginEvent()
    data class PasswordChanged(val value: String) : LoginEvent()
    data class ErrorMessage(val showError: Boolean = false, val title: String? = "", val message: String? = "") : LoginEvent()
    object PasswordShowClick : LoginEvent()
    object LoginClick : LoginEvent()
    object RegistrationClick : LoginEvent()
    object ForgotClick : LoginEvent()
}
