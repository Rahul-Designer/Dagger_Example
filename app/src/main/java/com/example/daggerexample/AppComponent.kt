package com.example.daggerexample

import com.example.daggerexample.Module.AnalyticsModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getAnalyticsService() : AnalyticsService
}