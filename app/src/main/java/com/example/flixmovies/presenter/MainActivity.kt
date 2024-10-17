package com.example.flixmovies.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.flixmovies.R
import com.example.flixmovies.databinding.ActivityMainBinding
import com.example.flixmovies.presenter.auth.login.LoginFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val loginFragment = LoginFragment()

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.container, loginFragment)
        transaction.commit()
    }
}