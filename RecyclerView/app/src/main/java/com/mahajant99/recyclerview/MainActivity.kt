package com.mahajant99.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    var countryNameList = ArrayList<String>()
    var details = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("India")
        countryNameList.add("Canda")
        countryNameList.add("USA")

        details.add("This is the India Flag")
        details.add("This is the Canada Flag")
        details.add("This is the USA Flag")

        imageList.add(R.drawable.india)
        imageList.add(R.drawable.canda)
        imageList.add(R.drawable.usa)

        adapter = CountriesAdapter(countryNameList, details, imageList, this@MainActivity)

        recyclerView.adapter = adapter

    }
}