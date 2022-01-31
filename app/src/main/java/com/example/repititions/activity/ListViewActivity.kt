package com.example.repititions.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.repititions.R
import com.example.repititions.adapter.ListViewAdapter
import com.example.repititions.model.Car2

class ListViewActivity : AppCompatActivity() {

    private lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        initViews()
    }
    private fun initViews(){
        listView = findViewById(R.id.lv_ListView)

        refreshAdapter(prepereObjects())
    }

    private fun prepereObjects() : ArrayList<Car2>{
        val cars = ArrayList<Car2>()
        cars.add(Car2(R.drawable.img_car1, "Lada", "$18000"))
        cars.add(Car2(R.drawable.img_car2, "Ferrari", "$15000"))
        cars.add(Car2(R.drawable.img_car3, "Tayotta", "$20000"))
        cars.add(Car2(R.drawable.img_car4, "Lambarjin", "$15000"))
        cars.add(Car2(R.drawable.img_car1, "Lada", "$18000"))
        cars.add(Car2(R.drawable.img_car2, "Ferrari", "$15000"))
        cars.add(Car2(R.drawable.img_car3, "Tayotta", "$20000"))
        cars.add(Car2(R.drawable.img_car4, "Lambarjin", "$15000"))
        cars.add(Car2(R.drawable.img_car1, "Lada", "$18000"))
        cars.add(Car2(R.drawable.img_car2, "Ferrari", "$15000"))
        cars.add(Car2(R.drawable.img_car3, "Tayotta", "$20000"))
        cars.add(Car2(R.drawable.img_car4, "Lambarjin", "$15000"))

        return cars
    }

    private fun refreshAdapter(cars : ArrayList<Car2>){
        val adapter = ListViewAdapter(cars)
        listView.adapter = adapter
    }
}