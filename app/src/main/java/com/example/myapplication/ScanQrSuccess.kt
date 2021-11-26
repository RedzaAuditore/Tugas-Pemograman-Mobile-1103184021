package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.qr_success.*


class ScanQrSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qr_success)

        button10.setOnClickListener {
            val go14 = Intent(this@ScanQrSuccess, HomeScreen::class.java)
            startActivity(go14)
        }
    }
}