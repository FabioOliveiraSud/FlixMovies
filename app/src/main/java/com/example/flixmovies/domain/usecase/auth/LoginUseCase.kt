package com.example.flixmovies.domain.usecase.auth

import com.example.flixmovies.domain.repository.auth.FirebaseAuthentication
import javax.inject.Inject

class LoginUseCase @Inject constructor (
    private val firebaseAuthentication: Fire
) {

    suspend operator fun invoke(email: String, password: String) {
        firebaseAuthentication.login(email,password)
    }

}