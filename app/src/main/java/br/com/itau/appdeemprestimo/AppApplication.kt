package br.com.itau.appdeemprestimo

import android.app.Application


class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}


