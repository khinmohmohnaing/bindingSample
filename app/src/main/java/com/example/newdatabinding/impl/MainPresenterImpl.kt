package com.example.newdatabinding.impl

import com.example.newdatabinding.presenter.MainPresenter
import com.example.newdatabinding.view.activity.MainView
import com.example.newdatabinding.model.TemperatureData
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(
    val view: MainView
): MainPresenter {
    override fun add(location:String) {
        view.add(location)
    }

    override fun showTempData(temperatureData: TemperatureData) {
        view.showData(temperatureData)
    }
}