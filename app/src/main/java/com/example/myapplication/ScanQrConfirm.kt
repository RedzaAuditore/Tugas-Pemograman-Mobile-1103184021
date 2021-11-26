package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.qr_confirm.*


class ScanQrConfirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qr_confirm)

        button8.setOnClickListener {
            val go13 = Intent(this@ScanQrConfirm, ScanQrSuccess::class.java)
            startActivity(go13)
        }
    }
}