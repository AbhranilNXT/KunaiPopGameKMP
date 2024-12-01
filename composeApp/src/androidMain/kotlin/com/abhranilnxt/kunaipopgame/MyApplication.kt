package com.abhranilnxt.kunaipopgame

import android.app.Application
import com.abhranilnxt.kunaipopgame.di.initializeKoin
import org.koin.android.ext.koin.androidContext

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin {
            androidContext(this@MyApplication)
        }
    }
}