package com.example.repititions.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.repititions.R
import com.example.repititions.activity.MainActivity
import com.example.repititions.activity.RecyclerViewActivity
import com.example.repititions.model.Car2

class RecyclerViewAdapter( val activity: RecyclerViewActivity, private val cars : ArrayList<Car2>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_cars, parent, false)
        return ObjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val car = cars[position]

        if(holder is ObjectViewHolder){
            holder.image_car.setImageResource(car.img)
            holder.name_car.text= car.name
            holder.cost_car.text = car.cost

            holder.item_click.setOnClickListener(View.OnClickListener {
                activity.openAboutChosenCarActivity(car)
            })

        }

    }

    override fun getItemCount() = cars.size

    class ObjectViewHolder(val view : View) : RecyclerView.ViewHolder(view){
        var image_car = view.findViewById<ImageView>(R.id.iv_image)
        var name_car = view.findViewById<TextView>(R.id.tv_name)
        var cost_car = view.findViewById<TextView>(R.id.tv_cost)
        val item_click = view.findViewById<LinearLayout>(R.id.ll_item)
    }

}