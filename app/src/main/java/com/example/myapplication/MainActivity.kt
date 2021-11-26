package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.login_screen.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        button.setOnClickListener {
                val go = Intent(this@MainActivity, HomeScreen::class.java)
                startActivity(go)
        }
        textView2.setOnClickListener {
            val go2 = Intent(this@MainActivity, Registration::class.java )
            startActivity(go2)
        }

    }
}