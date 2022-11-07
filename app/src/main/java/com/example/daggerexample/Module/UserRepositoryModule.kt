 package com.example.daggerexample.Module

import com.example.daggerexample.ActivityScope
import com.example.daggerexample.FirebaseRepository
import com.example.daggerexample.SQLRepository
import com.example.daggerexample.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {
//    @Provides
//    fun getFirebaseRepository() : UserRepository {
//        return FirebaseRepository()
//    }
    @Binds
    @ActivityScope
   abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository

}