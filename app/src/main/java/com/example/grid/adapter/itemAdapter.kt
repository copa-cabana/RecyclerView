package com.example.grid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.grid.R
import com.example.grid.model.Motivation

class itemAdapter (private val context: Context, private val dataSet : List<Motivation>)
    : RecyclerView.Adapter<itemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val motivationText: TextView = view.findViewById(R.id.item_title)
        val motivationImage : ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.motivationText.text = context.resources.getString(item.stringResourceId)
        holder.motivationImage.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataSet.size
}