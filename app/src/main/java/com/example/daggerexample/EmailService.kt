package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body: String)
}

@ApplicationScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d("RAHUL", "Email Send")
    }
}

class MessageService(private val  retryCount : Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d("RAHUL", "Message Send - Retry Count $retryCount")
    }

}