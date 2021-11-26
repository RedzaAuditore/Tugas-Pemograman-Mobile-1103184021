package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.transfer_confirm.*

class TransferConfirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transfer_confirm)

        button12.setOnClickListener{
            val go9 = Intent (this@TransferConfirm, TransferSuccess::class.java)
            startActivity(go9)
        }
    }
}