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

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val signin_btn : Button = findViewById(R.id.signin_btn)
        val sign_up_text : TextView = findViewById(R.id.sign_up_text)

        signin_btn.setOnClickListener{
            val intent = Intent(this, home_Activity::class.java)
            startActivity(intent)
        }
        sign_up_text.setOnClickListener{
            val intent = Intent(this, sign_up_activity::class.java)
            startActivity(intent)
        }
        }
    }
