package com.seankang.simplemvvmcompose

import android.app.Application
import com.seankang.simplemvvmcompose.di.appModules
import org.koin.core.context.startKoin

class SimpleMvvmComposeApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModules)
        }
    }
}