package com.example.foodapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.mylist.view.*

class MyAdapter(var foodList: ArrayList<Food>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mylist, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.name.text = foodList[position].name
        holder.itemView.image.setImageResource(foodList[position].image)

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, Recipe::class.java)
            intent.putExtra("image", foodList[position].image)
            intent.putExtra("title", foodList[position].name)
            intent.putExtra("recipe", foodList[position].recipe)
            holder.itemView.context.startActivity(intent);
        }

    }
    override fun getItemCount(): Int = foodList.size

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}
