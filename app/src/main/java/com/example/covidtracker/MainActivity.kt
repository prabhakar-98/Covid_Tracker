package com.example.covidtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: StateAdapter
    private lateinit var arrayList: ArrayList<Modalclass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recycler)
        arrayList= ArrayList()
        adapter= StateAdapter(this@MainActivity,arrayList)
        linearLayoutManager=LinearLayoutManager(this)

        recyclerView.adapter=adapter
        recyclerView.layoutManager=linearLayoutManager

    }
}