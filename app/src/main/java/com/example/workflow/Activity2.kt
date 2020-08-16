package com.example.workflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        // get reference to the second button
        val button =findViewById<Button>(R.id.button2)
        // attach listener to the button
        button.setOnClickListener {
            setContentView(R.layout.activity_main)

        }

    }
}