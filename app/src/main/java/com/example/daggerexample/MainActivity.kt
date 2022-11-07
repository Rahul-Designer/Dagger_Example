package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.Application.UserApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent
        val userRegistrationComponent = DaggerUserRegistrationComponent.builder()
            .appComponent(appComponent)
            .retryCount(3)
            .build()
        userRegistrationComponent.inject(this)
        userRegistrationService.registerUser("singhrahul50888@gmail.com", "11111111")
    }
}