package com.example.madlab2.modules

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.madlab2.R

class onbording_sc_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onbording_sc1)

        val ob_btn01 : Button = findViewById(R.id.ob_btn01)

        ob_btn01.setOnClickListener{
            val intent = Intent(this, onbording_sc_2::class.java)
            startActivity(intent)
        }
    }
}