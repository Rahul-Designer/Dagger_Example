package com.example.daggerexample.Module

import com.example.daggerexample.AnalyticsService
import com.example.daggerexample.Mixpanel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {
    @Singleton
    @Provides
    fun getAnalyticsService() : AnalyticsService{
        return Mixpanel()
    }
}