package com.mahajant99.listview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listview : ListView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listview = findViewById(R.id.list)

        var countrylist = resources.getStringArray(R.array.countries)

        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countrylist)

        listview.adapter = arrayAdapter

        listview.setOnItemClickListener{parent, view, position, id ->
            val countryName : String = parent.getItemAtPosition(position).toString()

            Toast.makeText(applicationContext, "You selected " + countryName, Toast.LENGTH_LONG).show()
        }

    }
}