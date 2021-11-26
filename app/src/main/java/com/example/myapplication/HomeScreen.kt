package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.homescreen.*
import kotlinx.android.synthetic.main.login_screen.*


class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)

        button6.setOnClickListener {
            val go5 = Intent(this@HomeScreen, MainActivity::class.java)
            startActivity(go5)
        }
        imageButton3.setOnClickListener {
            val go6 = Intent(this@HomeScreen, TopUp::class.java )
            startActivity(go6)
        }
        imageButton4.setOnClickListener {
            val go15 = Intent(this@HomeScreen, Transfer::class.java)
            startActivity(go15)
        }
        imageButton6.setOnClickListener {
            val go16 = Intent(this@HomeScreen, ScanQr::class.java)
            startActivity(go16)
        }
        imageView9.setOnClickListener {
            val go17 = Intent (this@HomeScreen, Profile::class.java)
            startActivity(go17)
        }
    }

}

