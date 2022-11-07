package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saverUser(email: String, password: String) {
        Log.d("RAHUL", "User Saved in DB")
    }
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saverUser(email: String, password: String) {
        Log.d("RAHUL", "User Saved in DB")
        analyticsService.traceEvent("Save User","Create")
    }

}

class FirebaseRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saverUser(email: String, password: String) {
        Log.d("RAHUL", "User Saved in Firebase")
        analyticsService.traceEvent("Save User","Create")
    }
}