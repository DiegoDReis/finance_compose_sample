package com.financeapp

import android.app.Application
import com.financeapp.home.di.HomeModule
import org.koin.core.context.GlobalContext.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Koin modules
        val homeModule = HomeModule().getModule()
        startKoin {
            modules(homeModule)
        }
    }
}