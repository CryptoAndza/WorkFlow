package com.example.workflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to the second button
        val button =findViewById<Button>(R.id.button)
        // attach listener to the button
        button.setOnClickListener {
            setContentView(R.layout.activity_2)

        }

    }
}