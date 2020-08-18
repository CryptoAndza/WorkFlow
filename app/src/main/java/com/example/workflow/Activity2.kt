package com.example.workflow

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

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

    fun onClickNext2(view: View)
    {
        // onClick will trigger new activity to open
        // Create an Intent to start the second activity

        val newIntent = Intent (this, Activity3::class.java)
        startActivity(newIntent)
    }
    fun onClickNext3(view: View)
    {
        // onClick will trigger new activity to open
        // Create an Intent to start the second activity

        val newIntent = Intent (this, Activity4::class.java)
        startActivity(newIntent)
    }

}