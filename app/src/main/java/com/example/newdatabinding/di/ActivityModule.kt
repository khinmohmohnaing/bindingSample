package com.example.newdatabinding.di

import com.example.newdatabinding.view.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {
    @ContributesAndroidInjector(modules = [MainModule::class])
    fun mainActivity(): MainActivity
}