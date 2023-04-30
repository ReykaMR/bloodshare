package com.example.a10120766latihan2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// 27-04-2023, NIM:10120766, Reyka Mochammad Raihan, IF-9

class VerifyAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_account)
        val veryacc = findViewById<Button>(R.id.veryacc)
        veryacc.setOnClickListener {
            val intent = Intent(this@VerifyAccountActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}