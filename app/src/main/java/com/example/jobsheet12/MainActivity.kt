package com.example.jobsheet12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.Button1)
        button.setOnClickListener {
            val Intent = Intent(  this, profilesaya::class.java)
            startActivity(Intent)
        }
        val button2 = findViewById<Button>(R.id.Button2)
        button2.setOnClickListener {
            val Intent = Intent(  this, profilesekolah::class.java)
            startActivity(Intent)
        }
    }
}