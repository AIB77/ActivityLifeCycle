package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitylifecycle.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "OnCreate")
    }

    override fun onStart()
    {
        super.onStart()
        Log.i("MainActivity", "OnStart")
    }

    override fun onPause()
    {
        super.onPause()
        Log.i("MainActivity", "OnPause")
    }

    override fun onResume()
    {
        super.onResume()
        Log.i("MainActivity", "OnResume")
    }

    override fun onStop()
    {
        super.onStop()
        Log.i("MainActivity", "OnStop")
    }

    override fun onDestroy()
    {
        super.onDestroy()
        Log.i("MainActivity", "OnDestroy")
    }

}