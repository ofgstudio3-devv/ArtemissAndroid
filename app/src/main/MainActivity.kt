package com.omar.artemiss

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Artemiss FUNCIONA!"
        tv.textSize = 28f
        tv.setPadding(40,300,40,40)
        setContentView(tv)
    }
}
