package com.example.androidfirebase

import android.app.Application
import com.example.androidfirebase.di.AppContainer
import com.example.androidfirebase.di.MahasiswaContainer

class MahasiswaApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate(){
        super.onCreate()
        container= MahasiswaContainer()
    }
}