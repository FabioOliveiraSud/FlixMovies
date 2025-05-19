package com.example.flixmovies.presenter.auth.forgot

import androidx.lifecycle.ViewModel
import com.example.flixmovies.domain.usecase.auth.ForgotUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ForgotViewModel @Inject constructor(
    private val forgotUseCase: ForgotUseCase
) : ViewModel() {
}