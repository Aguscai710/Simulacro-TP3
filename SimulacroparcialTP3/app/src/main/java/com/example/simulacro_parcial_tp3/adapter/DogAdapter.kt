package com.example.simulacro_parcial_tp3.adapter
import com.example.simulacro_parcial_tp3.view_holder.DogViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simulacro_parcial_tp3.R
import com.example.simulacro_parcial_tp3.model.Dog

class DogViewHolder(var dogList: List<Dog>) : RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog_cell, parent, false ))
    }

    override fun getItemCount(): Int = dogList.size


    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        var item = dogList[position]
        holder.render(item)
    }


}