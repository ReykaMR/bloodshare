package com.example.a10120766latihan2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// 26-04-2023, NIM:10120766, Reyka Mochammad Raihan, IF-9

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val register = findViewById<Button>(R.id.register)
        register.setOnClickListener {
            val intent = Intent(this@RegisterActivity, AlmostThereActivity::class.java)
            startActivity(intent)
        }
    }
}