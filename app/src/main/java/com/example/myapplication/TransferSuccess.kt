package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.transfer.*
import kotlinx.android.synthetic.main.transfer_success.*

class TransferSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transfer_success)

        button13.setOnClickListener {
            val go10 = Intent(this@TransferSuccess, HomeScreen::class.java)
            startActivity(go10)
        }
    }
}