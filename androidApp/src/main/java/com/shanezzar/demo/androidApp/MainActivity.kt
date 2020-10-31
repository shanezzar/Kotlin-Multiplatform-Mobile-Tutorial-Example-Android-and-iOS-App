package com.shanezzar.demo.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shanezzar.demo.shared.Greeting
import com.shanezzar.demo.shared.HelloWorld
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

fun helloWorld(): String {
    return HelloWorld().helloWorld()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = helloWorld()
    }
}
