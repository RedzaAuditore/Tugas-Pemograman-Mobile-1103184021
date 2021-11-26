package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.topup_success.*


class TopUpSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topup_success)

        button9.setOnClickListener {
            val go11 = Intent(this@TopUpSuccess, HomeScreen::class.java)
            startActivity(go11)
        }
    }
}