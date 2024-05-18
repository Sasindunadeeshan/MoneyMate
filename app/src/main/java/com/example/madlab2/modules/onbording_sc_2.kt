package com.example.madlab2.modules

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.madlab2.R

class onbording_sc_2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onbording_sc2)

        val ob_btn_02 :Button = findViewById(R.id.ob_btn_02)

        ob_btn_02.setOnClickListener{
            val intent =  Intent(this , onbording_sc_3 :: class.java)

            startActivity(intent)
        }
    }
}