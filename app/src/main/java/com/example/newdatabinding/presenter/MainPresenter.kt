package com.example.newdatabinding.presenter

import com.example.newdatabinding.model.UserInfo

interface MainPresenter {
    fun showTempData(temperatureData: UserInfo)
    fun add(location:String)
}