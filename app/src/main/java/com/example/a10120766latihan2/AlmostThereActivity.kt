package com.example.a10120766latihan2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// 28-04-2023, NIM:10120766, Reyka Mochammad Raihan, IF-9

class AlmostThereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)
        val veri = findViewById<Button>(R.id.veri)
        veri.setOnClickListener {
            val intent = Intent(this@AlmostThereActivity, VerifyAccountActivity::class.java)
            startActivity(intent)
        }
    }
}