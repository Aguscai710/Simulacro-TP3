package com.example.simulacro_parcial_tp3.view_holder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simulacro_parcial_tp3.R
import com.example.simulacro_parcial_tp3.model.Dog


class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val nombre = itemView.findViewById<TextView>(R.id.perroNombre)


    fun render(model : Dog){
        nombre.text = model.nombre;

    }
}
