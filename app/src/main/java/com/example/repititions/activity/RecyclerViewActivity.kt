package com.example.repititions.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.repititions.R
import com.example.repititions.adapter.ListViewAdapter
import com.example.repititions.adapter.RecyclerViewAdapter
import com.example.repititions.model.Car2

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        initViews()
    }

    private fun initViews(){
        recyclerView = findViewById(R.id.rv_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

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

    private fun refreshAdapter( cars : ArrayList<Car2>){
        val adapter = RecyclerViewAdapter(this, cars)
        recyclerView.adapter = adapter
    }

    fun openAboutChosenCarActivity(car2: Car2){
        var intent = Intent(this, AboutChosenCarAvtivity::class.java)
        intent.putExtra("request", car2)
        startActivity(intent)
    }
}