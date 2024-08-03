package com.kangengineering.simplemvvmcompose

import android.app.Application
import com.kangengineering.simplemvvmcompose.di.appModules
import org.koin.core.context.startKoin

class SimpleMvvmComposeApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModules)
        }
    }
}