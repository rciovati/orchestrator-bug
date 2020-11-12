package com.example.orchestratorbug

import android.app.Application
import android.util.Log

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("asdf", "Application#onCreate")
    }
}
