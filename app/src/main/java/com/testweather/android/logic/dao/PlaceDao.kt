package com.testweather.android.logic.dao

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.google.gson.Gson
import com.testweather.android.TestWeatherApplication
import com.testweather.android.logic.model.Place

object PlaceDao {

    fun savePlace(place:Place){
        sharedPreferences().edit {
            putString("place",Gson().toJson(place))
        }

    }

    fun getSavedPlace():Place{
        val placeJson = sharedPreferences().getString("place","")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")
    private fun sharedPreferences() = TestWeatherApplication.context.
        getSharedPreferences("test_weather",Context.MODE_PRIVATE)
}