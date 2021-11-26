package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.scanqr.*


class ScanQr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scanqr)

        imageButton7.setOnClickListener {
            val go12 = Intent(this@ScanQr, ScanQrConfirm::class.java)
            startActivity(go12)
        }
    }
}