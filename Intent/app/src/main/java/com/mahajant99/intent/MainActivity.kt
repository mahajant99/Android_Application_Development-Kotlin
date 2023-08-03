package com.mahajant99.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText;
    lateinit var age: EditText;
    lateinit var submit: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.username)
        age = findViewById(R.id.age)
        submit = findViewById(R.id.button)

        submit.setOnClickListener{

            var userName: String = name.text.toString()
            var userAge : Int = age.text.toString().toInt()

            var intent = Intent(this@MainActivity,MainActivity2::class.java)
            intent.putExtra("username",userName)
            intent.putExtra("userage",userAge)
            startActivity(intent)

        }
    }
}