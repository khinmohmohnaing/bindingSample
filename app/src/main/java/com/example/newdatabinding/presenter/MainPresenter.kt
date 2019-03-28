package com.example.newdatabinding.presenter

import com.example.newdatabinding.model.TemperatureData

interface MainPresenter {
    fun showTempData(temperatureData: TemperatureData)
    fun add(location:String)
}