package com.example.madlab2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.madlab2.modules.onbording_sc_1

private val handler = Handler(Looper.getMainLooper())

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            handler.postDelayed({
                startActivity(Intent(this, onbording_sc_1::class.java))
                finish()
            }, 2500L)
        }
    }
