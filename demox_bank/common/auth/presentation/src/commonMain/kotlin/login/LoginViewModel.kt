package login

import com.adeo.kviewmodel.BaseSharedViewModel
import json.di.Inject
import kotlinx.coroutines.launch
import login.models.LoginAction
import login.models.LoginEvent
import login.models.LoginViewState
import repository.AuthRepository

class LoginViewModel : BaseSharedViewModel<LoginViewState, LoginAction, LoginEvent>(
    initialState = LoginViewState(phone = "", password = "")
) {

    private val authRepository: AuthRepository = Inject.instance()

    init {
        checkUserLoggedIn()
    }

    override fun obtainEvent(viewEvent: LoginEvent) {
        when (viewEvent) {
            is LoginEvent.LoginClick -> sendLogin()
            is LoginEvent.PhoneChanged -> obtainEmailChanged(viewEvent.value)
            is LoginEvent.PasswordChanged -> obtainPasswordChanged(viewEvent.value)
            is LoginEvent.ForgotClick -> openForgot()
            is LoginEvent.RegistrationClick -> openRegistration()
            is LoginEvent.PasswordShowClick -> changePasswordVisibility()
            is LoginEvent.ErrorMessage -> showMessage(viewEvent.showError, viewEvent.title, viewEvent.message)
        }
    }

    private fun showMessage(showError: Boolean, title: String?, message: String?) {
        TODO("Not yet implemented")
    }

    private fun checkUserLoggedIn() {
        if (authRepository.isUserLoggedIn()) {
            viewAction = LoginAction.OpenMainFlow
        }
    }

    private fun sendLogin() {
        viewState = viewState.copy(isSending = true)
        viewModelScope.launch {
            val response = authRepository.register(viewState.phone.toLong(), viewState.password)

            if (response.success) {
                viewState = viewState.copy(phone = "", password = "", isSending = false)
                viewAction = LoginAction.OpenMainFlow
            } else {
                viewState = viewState.copy(isSending = false)
            }
        }
    }

    private fun changePasswordVisibility() {
        viewState = viewState.copy(passwordHidden = !viewState.passwordHidden)
    }

    private fun openForgot() {
        viewAction = LoginAction.OpenForgotPasswordScreen
    }

    private fun openRegistration() {
        viewAction = LoginAction.OpenRegistrationScreen
    }

    private fun obtainEmailChanged(value: String) {
        viewState = viewState.copy(
            phone = value
        )
    }

    private fun obtainPasswordChanged(value: String) {
        viewState = viewState.copy(
            password = value
        )
    }
}
