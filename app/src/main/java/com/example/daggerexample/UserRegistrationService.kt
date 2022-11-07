package com.example.daggerexample

import com.example.daggerexample.Qualifier.MessageQualifier
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private var userRepository: UserRepository,
    @MessageQualifier private var notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saverUser(email, password)
        notificationService.send(email, "rahulsingh_rs@gmail.com", "User Registered")
    }
}