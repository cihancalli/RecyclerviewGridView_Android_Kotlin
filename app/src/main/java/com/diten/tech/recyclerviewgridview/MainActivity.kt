package com.diten.tech.recyclerviewgridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diten.tech.recyclerviewgridview.adapter.Adapter
import com.diten.tech.recyclerviewgridview.model.DataModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: Adapter
    private  var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = GridLayoutManager(applicationContext,7)
        photoAdapter = Adapter(applicationContext)
        recyclerView.adapter = photoAdapter

        for (i in 1..30){
            dataList.add(DataModel("$i"))
        }


        photoAdapter.setDataList(dataList)
    }
}