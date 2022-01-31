package com.example.repititions.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.repititions.R

class DetailActivity : AppCompatActivity() {

    private lateinit var receivedTextView : TextView
    private lateinit var responseEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initViews()
    }

    private fun initViews(){
        val sendButton = findViewById<Button>(R.id.btn_send_main)
        receivedTextView = findViewById<TextView>(R.id.tv_result)
        responseEditText = findViewById(R.id.et_response)

        //receiveString()
        receiveObject()

        sendButton.setOnClickListener(View.OnClickListener {
            sendResponsToMainActivtity()
        })
    }


    private fun receiveString(){
        val str = intent.getStringExtra("str")
        receivedTextView.text = str
    }

    private fun receiveObject(){
        val car = intent.getSerializableExtra("car")
        receivedTextView.text = car.toString()

    }

    private fun sendResponsToMainActivtity(){
        val intent = Intent()
        intent.putExtra("result", responseEditText.text.toString())
        setResult(RESULT_OK,intent)
        finish()
    }

}