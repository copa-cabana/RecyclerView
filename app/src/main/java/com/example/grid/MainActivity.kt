package com.example.grid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.grid.adapter.itemAdapter
import com.example.grid.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataSet = DataSource().loadMotivations()
        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerview.adapter = itemAdapter(this, myDataSet)
//        recyclerview.setHasFixedSize(true)


    }
}