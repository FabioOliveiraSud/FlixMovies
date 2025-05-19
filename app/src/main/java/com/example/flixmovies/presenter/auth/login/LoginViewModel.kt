package com.example.flixmovies.presenter.auth.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.flixmovies.domain.usecase.auth.LoginUseCase
import com.example.flixmovies.util.StateView
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
): ViewModel() {

    fun login(email: String, password: String) = liveData(Dispatchers.IO) {
        try {

            emit(StateView.Loading())

            loginUseCase.invoke(email, password)

            emit(StateView.Success(Unit))

        } catch (exception: Exception) {
            exception.printStackTrace()
            emit(StateView.Error(message = exception.message))

        }
    }
}