package com.example.workflow

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.util.*

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

   // private var map : Map = map()
    private var mapFragment : SupportMapFragment = SupportMapFragment()
   // private lateinit var marker : MapMarker
    private lateinit var editText: EditText

    //internal var score = 0
    //internal var gameStarted = false

    //internal lateinit var countDownTimer: CountDownTimer
   // internal val initialCountDown: Long = 60000
   // internal val countDownInterval: Long = 1000
   // internal var timeLeftOnTimer: Long = 60000

    //internal lateinit var tapMeButton: Button
    //internal lateinit var gameScoreTextView: TextView
    //internal lateinit var timeLeftTextView: TextView

    //companion object {
    //    private val TAG = MainActivity::class.java.simpleName
    //    private const val SCORE_KEY = "SCORE_KEY"
    //    private const val TIME_LEFT_KEY = "TIME_LEFT_KEY"
    //}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mapFragment = getSupportFragmentManager().findFragmentById(R.id.Maps) as SupportMapFragment
/*
        mapFragment.init { error ->
            if (error == OnEngineInitListener.Error.NONE) {
                map = mapFragment.map
                map.setCenter(GeoCoordinate(37.7397, -121.4252, 0.0), Map.Animation.NONE)
                map.zoomLevel = (map.maxZoomLevel + map.minZoomLevel) / 2
                */

               // Log.d(TAG, "onCreate called. Score is: $score")


               // tapMeButton = findViewById(R.id.tapMeButton)
               // gameScoreTextView = findViewById(R.id.gameScoreTextView)
                //timeLeftTextView = findViewById(R.id.timeLeftTextView)

               // tapMeButton.setOnClickListener { view ->
               //     incrementScore()
               // }

                val mapFragment = supportFragmentManager
                    .findFragmentById(R.id.Maps) as SupportMapFragment
                mapFragment.getMapAsync(this)
            }

            /*
            editText = findViewById(R.id.query)

            editText.setOnKeyListener(View.OnKeyListener { _, keyCode, keyevent ->
                if (keyCode == KeyEvent.KEYCODE_ENTER && keyevent.action == KeyEvent.ACTION_UP) {
                    dropMarker(editText.text.toString())
                    editText.setText("")
                    return@OnKeyListener true
                }
                false
            })
        }
    }
    */

   /*
    fun dropMarker(query: String) {
        if (::marker.isInitialized) {
            map.removeMapObject(marker)
        }
        val tracy = GeoCoordinate(37.7397, -121.4252)
        val request = GeocodeRequest2(query).setSearchArea(tracy, 5000)
        request.execute { results, error ->
            if (error != PlaybackStateCompat.ErrorCode.NONE) {
                Log.e("HERE", error.toString())
            } else {
                for (result in results) {
                    marker = MapMarker()
                    marker.coordinate = GeoCoordinate(
                        result.location.coordinate.latitude,
                        result.location.coordinate.longitude,
                        0.0
                    )
                    map.addMapObject(marker)
                }
            }
        }
    }
    */
   private fun setMapLongClick(map: GoogleMap) {
       map.setOnMapLongClickListener { latLng ->
           val snippet = String.format(
               Locale.getDefault(),
               "Lat: %1$.5f, Long: %2$.5f",
               latLng.latitude,
               latLng.longitude
           )

           map.addMarker(
               MarkerOptions()
                   .position(latLng)
                   .title(getString(R.string.location_of_project))
                   .snippet(snippet)
           )
       }
   }




    override fun onMapReady(googleMap: GoogleMap){
        mMap = googleMap

        mMap.uiSettings.isZoomControlsEnabled = true
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 10.0f))
        setMapLongClick(mMap)

    }

  //  private fun incrementScore() {
  //      score += 1
   //     val newScore = getString(R.string.yourScore, score)
    //    gameScoreTextView.text = newScore
//
//       gameScoreTextView.text = getString(R.string.yourScore, score)
  //  }

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
