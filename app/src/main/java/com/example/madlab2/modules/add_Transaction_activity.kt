package com.example.madlab2.modules

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.madlab2.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class add_Transaction_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_transaction)


            val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigation)

            bottomNavigation.selectedItemId = R.id.home

            bottomNavigation.setOnNavigationItemSelectedListener { item ->

                when (item.itemId) {
                    R.id.home -> {
                        val intent = Intent(this, home_Activity::class.java)
                        startActivity(intent)
                        true
                    }

                    R.id.add -> {
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

