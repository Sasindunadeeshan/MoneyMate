package com.example.madlab2.modules

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.madlab2.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class home_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

            val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigation)

            bottomNavigation.selectedItemId = R.id.home

            bottomNavigation.setOnNavigationItemSelectedListener { item ->

                when (item.itemId) {
                    R.id.home -> {
                        true
                    }

                    R.id.add -> {
                        val intent = Intent(this, add_Transaction_activity::class.java)
                        startActivity(intent)
                        true
                    }

                    R.id.profile -> {
                        val intent = Intent(this, profile_activity::class.java)
                        startActivity(intent)
                        true
                    }

                    else -> false
                }
            }
        }
    }

