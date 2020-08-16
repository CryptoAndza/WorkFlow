package com.example.workflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickNext( view: View)
    {
        // onClick will trigger new activity to open
        // Create an Intent to start the second activity

        val newIntent = Intent ( this, Activity2::class.java)
        startActivity(newIntent)
    }

}