package com.example.daggerexample.Application

import android.app.Application
import com.example.daggerexample.AppComponent
import com.example.daggerexample.DaggerAppComponent

class UserApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
       appComponent = DaggerAppComponent.builder().build()
    }
}