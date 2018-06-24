package com.example.bengeorge.checkpoint2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        weather.setOnClickListener {
            val intent = Intent(this, WeatherWidget::class.java)
            startActivity(intent)
        }
        traffic.setOnClickListener {
            val intent = Intent(this, TrafficWidget::class.java)
            startActivity(intent)
        }


    }
}
