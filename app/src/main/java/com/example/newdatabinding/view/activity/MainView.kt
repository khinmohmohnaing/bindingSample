package com.example.newdatabinding.view.activity

import com.example.newdatabinding.model.UserInfo

interface MainView {
    fun showData(temperatureData: UserInfo)
    fun add(location:String)
}