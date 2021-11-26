package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.login_screen.*
import kotlinx.android.synthetic.main.registrasiscreen.*

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrasiscreen)

        imageButton.setOnClickListener {
            val go3 = Intent(this@Registration, MainActivity::class.java)
            startActivity(go3)
        }
        button2.setOnClickListener {
            val go4 = Intent(this@Registration, HomeScreen::class.java)
            startActivity(go4)
        }
    }
}