package com.example.bengeorge.checkpoint2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_weather_widget.*

class WeatherWidget : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_widget)

        enterBtn.setOnClickListener {
            val temp = city.text.toString()
            cityOutput.text = temp
            city.text.clear()
        }

    }
}
