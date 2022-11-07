package com.example.daggerexample


import com.example.daggerexample.Module.NotificationServiceModule
import com.example.daggerexample.Module.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    // Factory Pattern
//    @Component.Factory
//    interface Factory {
//        fun create( @BindsInstance retryCount : Int,appComponent: AppComponent) : UserRegistrationComponent
//    }



    @Component.Builder
    interface Builder {
        fun build() : UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int) : Builder
        fun appComponent(appComponent: AppComponent) : Builder
    }


    // Builder Pattern Process

    // @Component.Builder
    // build -----> Component
    // Method -----> Builder


//    @Subcomponent.Builder
//    interface Builder {
//        fun build(): UserRegistrationComponent
//        fun retryCount(@BindsInstance retryCount: Int): Builder
//    }
}