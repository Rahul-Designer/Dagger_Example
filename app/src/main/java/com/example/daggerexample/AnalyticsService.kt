package com.example.daggerexample

import android.util.Log

interface AnalyticsService {
    fun traceEvent(eventName: String, eventType: String)
}

class Mixpanel : AnalyticsService {
    override fun traceEvent(eventName: String, eventType: String) {
        Log.d("RAHUL", "Mixpanel - $eventName - $eventType")
    }
}

class FirebaseAnalytics : AnalyticsService {
    override fun traceEvent(eventName: String, eventType: String) {
        Log.d("RAHUL", "FirebaseAnalytics - $eventName - $eventType")
    }
}