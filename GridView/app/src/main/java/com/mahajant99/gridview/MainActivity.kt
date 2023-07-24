package com.mahajant99.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        fillArrays()

        var adapter = AnimalsAdapter(this, nameList, imageList)

        gridView.adapter = adapter

    }

    fun fillArrays(){
        nameList.add("One")
        nameList.add("Two")
        nameList.add("Three")
        nameList.add("Four")
        nameList.add("Five")
        nameList.add("Six")
        nameList.add("Seven")
        nameList.add("Eight")
        nameList.add("Nine")

        imageList.add(R.drawable.one)
        imageList.add(R.drawable.two)
        imageList.add(R.drawable.three)
        imageList.add(R.drawable.four)
        imageList.add(R.drawable.five)
        imageList.add(R.drawable.six)
        imageList.add(R.drawable.seven)
        imageList.add(R.drawable.eight)
        imageList.add(R.drawable.nine)
    }
}