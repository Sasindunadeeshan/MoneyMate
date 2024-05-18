package com.example.madlab2.modules

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.madlab2.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class profile_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottomNavigation)

        bottomNavigation.selectedItemId = R.id.home

        bottomNavigation.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, home_Activity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.add -> {
                    val intent = Intent(this, add_Transaction_activity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    true
                }
                else -> false
            }
        }

    }
}