package com.example.newdatabinding.di

import com.example.newdatabinding.view.activity.MainActivity
import com.example.newdatabinding.presenter.MainPresenter
import com.example.newdatabinding.impl.MainPresenterImpl
import com.example.newdatabinding.view.activity.MainView
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(includes = [MainModule.Declarations::class])
object MainModule {
    @Provides
    @JvmStatic
    fun mainView(mainActivity: MainActivity): MainView = mainActivity
    @Module
    interface Declarations {
        @Binds
        fun mainPresenter(mainPresenterImpl: MainPresenterImpl): MainPresenter
    }
}