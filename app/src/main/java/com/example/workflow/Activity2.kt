package com.example.workflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

    }

    fun onClickBack(view: View)
    {
        // onClickBack will trigger new activity to open
        // Create an Intent to start the MainActivity

        val newIntent2 = Intent (this, MainActivity::class.java)
        startActivity(newIntent2)
    }

}