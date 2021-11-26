package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.transfer.*

class Transfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transfer)

        button11.setOnClickListener{
            val go8 = Intent (this@Transfer, TransferConfirm::class.java)
            startActivity(go8)
        }
    }
}

