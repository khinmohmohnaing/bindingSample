package com.example.newdatabinding.di

import android.content.Context
import com.example.newdatabinding.App
import dagger.Module
import dagger.Provides

@Module
object AppModule {
    @Provides
    @JvmStatic
    fun applicationContext(app: App): Context = app
}