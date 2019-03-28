package com.example.newdatabinding.view.activity

import com.example.newdatabinding.model.TemperatureData

interface MainView {
    fun showData(temperatureData: TemperatureData)
    fun add(location:String)
}