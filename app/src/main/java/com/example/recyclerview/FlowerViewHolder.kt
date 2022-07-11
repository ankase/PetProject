package com.example.recyclerview


import android.view.View
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_deatils.view.*

class FlowerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val title = itemView.tittle
    private val poster = itemView.poster
    private val description = itemView.description

    fun bind(flower: Flower){
        title.text = flower.title
        poster.setImageResource(flower.poster)
        description.text=flower.description
    }
}