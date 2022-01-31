package com.example.repititions.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.repititions.R
import com.example.repititions.model.Car2

class AboutChosenCarAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_chosen_car_avtivity)

        initViews()
    }
    private fun initViews(){
        val nameTextView = findViewById<TextView>(R.id.tv_chosen_car)

        val car2 = intent.getSerializableExtra("request")
        nameTextView.text = car2.toString()
    }
}