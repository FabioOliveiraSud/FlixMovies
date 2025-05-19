package com.example.flixmovies.domain.usecase.auth

import javax.inject.Inject

class ForgotUseCase @Inject constructor (
    private val firebaseAuthentication: FirebaseAuthentication
) {

    suspend operator fun invoke(email: String) {
        firebaseAuthentication.forgot(email)
    }

}