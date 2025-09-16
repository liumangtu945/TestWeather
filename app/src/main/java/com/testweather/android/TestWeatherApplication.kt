package com.testweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class TestWeatherApplication :Application(){

    companion object{
        const val TOKEN="77JWhBYOqH3eJJVS"
        @SuppressLint("StaticFieldLink")
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}

