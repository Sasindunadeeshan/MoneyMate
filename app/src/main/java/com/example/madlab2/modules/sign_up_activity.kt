package com.example.madlab2.modules

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.madlab2.R

class sign_up_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val sign_up_btn : Button = findViewById(R.id.sign_up_btn)
        val sign_in_text : TextView = findViewById(R.id.sign_in_text)

        sign_up_btn.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        sign_in_text.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        }
    }