package com.revia.mvpexperimental.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.revia.mvpexperimental.R

class MainActivity : AppCompatActivity(),MainActivityView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onUserLoginSuccess() {
        println("success")
    }

    override fun onUserLoginFailure() {
        println("failure")
    }
}