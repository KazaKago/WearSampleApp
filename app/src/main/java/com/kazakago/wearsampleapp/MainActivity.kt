package com.kazakago.wearsampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.wear.ambient.AmbientModeSupport

class MainActivity : AppCompatActivity(R.layout.activity_main), AmbientModeSupport.AmbientCallbackProvider {

    override fun getAmbientCallback() = object : AmbientModeSupport.AmbientCallback() {

        override fun onEnterAmbient(ambientDetails: Bundle) {
            super.onEnterAmbient(ambientDetails)
        }

        override fun onExitAmbient() {
            super.onExitAmbient()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AmbientModeSupport.attach(this)
    }

}
