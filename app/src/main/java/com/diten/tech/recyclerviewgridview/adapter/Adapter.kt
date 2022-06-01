package com.diten.tech.recyclerviewgridview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.diten.tech.recyclerviewgridview.R
import com.diten.tech.recyclerviewgridview.model.DataModel

class Adapter (private var context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    var dataList = emptyList<DataModel>()

    internal fun setDataList(datalist : List<DataModel>){
        this.dataList = datalist
        notifyDataSetChanged()
    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var title : TextView

        init {
            title = itemView.findViewById(R.id.title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.cell_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        var data = dataList[position]

        holder.title.text  = data.title

    }


}