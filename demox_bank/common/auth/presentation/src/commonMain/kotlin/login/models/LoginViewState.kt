package login.models

data class LoginViewState(
    val phone: String,
    val password: String,
    val isSending: Boolean = false,
    val passwordHidden: Boolean = true
)
