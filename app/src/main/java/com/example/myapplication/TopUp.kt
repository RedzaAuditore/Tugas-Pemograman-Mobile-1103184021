package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.topup.*

class TopUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topup)

        imageButton2.setOnClickListener{
            val go7 = Intent (this@TopUp, TopUpSuccess::class.java)
            startActivity(go7)
        }
    }
}

