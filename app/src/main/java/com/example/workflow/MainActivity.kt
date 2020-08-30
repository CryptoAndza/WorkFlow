package com.example.workflow

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

   internal var score = 0
    internal lateinit var tapMeButton: Button
    internal lateinit var gameScoreTextView: TextView
    internal lateinit var timeLeftTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         tapMeButton = findViewById(R.id.tapMeButton)
         gameScoreTextView = findViewById(R.id.gameScoreTextView)
         timeLeftTextView = findViewById(R.id.timeLeftTextView)

        tapMeButton.setOnClickListener { view ->
             incrementScore()
        }

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.Maps) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap){
        mMap = googleMap

        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

    }

    private fun incrementScore() {
        score += 1
        val newScore = getString(R.string.yourScore, score)
        gameScoreTextView.text = newScore

       gameScoreTextView.text = getString(R.string.yourScore, score)
    }

    fun onClickNext(view: View) {
        // onClick will trigger new activity to open
        // Create an Intent to start the second activity

        val newIntent = Intent(this, Activity2::class.java)
        startActivity(newIntent)
    }

    fun onClickNext2(view: View) {
        // onClick will trigger new activity to open
        // Create an Intent to start the second activity

        val newIntent = Intent(this, Activity3::class.java)
        startActivity(newIntent)
    }

    fun onClickNext3(view: View) {
        // onClick will trigger new activity to open
        // Create an Intent to start the second activity

        val newIntent = Intent(this, Activity4::class.java)
        startActivity(newIntent)
    }

    fun onClickNext4(view: View) {
        // onClick will trigger new activity to open
        // Create an Intent to start the second activity

        val newIntent = Intent(this, MapsActivity::class.java)
        startActivity(newIntent)
    }
}
