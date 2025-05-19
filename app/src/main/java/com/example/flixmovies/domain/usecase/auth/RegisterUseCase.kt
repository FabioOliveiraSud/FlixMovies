package com.example.flixmovies.domain.usecase.auth


import javax.inject.Inject

class RegisterUseCase @Inject constructor (
    private val firebaseAuthentication: FirebaseAuthentication
) {

    suspend operator fun invoke(email: String, password: String) {
        firebaseAuthentication.register(email,password)
    }

}