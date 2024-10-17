package com.example.flixmovies.di

import com.example.flixmovies.data.repository.auth.FirebaseAuthImpl
import com.example.flixmovies.domain.repository.auth.FirebaseAuthentication
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsFirebaseAuthenticationImpl(
        bindsFirebaseAuthentication: FirebaseAuthImpl
    ): FirebaseAuthentication
}