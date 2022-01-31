package com.example.repititions.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.repititions.R
import com.example.repititions.model.Car2

class ListViewAdapter(private val cars : ArrayList<Car2>) : BaseAdapter(){
    override fun getCount() = cars.size

    override fun getItem(position: Int) = cars[position]

    override fun getItemId(position: Int) = position.toLong()

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_list_cars, null)

        val image_car = view.findViewById<ImageView>(R.id.iv_image)
        val name_car = view.findViewById<TextView>(R.id.tv_name)
        val cost_car = view.findViewById<TextView>(R.id.tv_cost)

        val car = cars[position]

        image_car.setImageResource(car.img)
        name_car.text = car.name
        cost_car.text = car.cost

        return view
    }
}