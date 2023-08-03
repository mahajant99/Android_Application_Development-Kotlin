package com.mahajant99.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        result = findViewById(R.id.textView3)

        var userName : String = intent.getStringExtra("username").toString()
        var userAge : Int = intent.getIntExtra("userage",0)

        result.text = "Your Name is $userName and your age is $userAge"

    }
}