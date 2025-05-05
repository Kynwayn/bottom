package com.example.bottommenupod

import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    welcomeText.text = "Welcome to the Home"
                    true
                }
                R.id.navigation_wallet -> {
                    welcomeText.text = "Welcome to the Wallet"
                    true
                }
                R.id.navigation_track -> {
                    welcomeText.text = "Welcome to the Track"
                    true
                }
                R.id.navigation_profile -> {
                    welcomeText.text = "Welcome to the Profile"
                    true
                }
                else -> false
            }
        }
    }


}