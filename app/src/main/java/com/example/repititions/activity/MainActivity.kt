package com.example.repititions.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.repititions.R
import com.example.repititions.model.Car

class MainActivity : AppCompatActivity() {

    private lateinit var textEdittext :EditText
    private lateinit var resultTextView :TextView

    val LAUNCH_DETAIL = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews(){
        textEdittext = findViewById<EditText>(R.id.et_text)
        resultTextView = findViewById(R.id.tv_result)

        val opedButtonDetail = findViewById<Button>(R.id.btn_open_detail)

        opedButtonDetail.setOnClickListener(View.OnClickListener {
            //openDetailActivity()
            //openListViewActivity()
            //openRecyclerViewActivity()
            openLayoutActivity()
        })
    }

    private fun openLayoutActivity(){
        startActivity(Intent(this,LayoutActivity::class.java))
    }

    private fun openRecyclerViewActivity(){
        startActivity(Intent(this,RecyclerViewActivity::class.java))
    }

    private fun openListViewActivity(){
        startActivity(Intent(this,ListViewActivity::class.java))
    }

    private fun openDetailActivity(){
        //sendString()
        //sendObject()
        sendForReceiveResponseOld()
    }

    private fun sendObject(){
        val car = Car(1, "Malibu")

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("car", car)
        startActivity(intent)
    }

    private fun sendString(){
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("str", textEdittext.text.toString())
        startActivity(intent)
    }

    private fun sendForReceiveResponseOld(){
        val car = Car(1, "Malibu")

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("car", car)
        startActivityForResult(intent,LAUNCH_DETAIL)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == LAUNCH_DETAIL && resultCode == Activity.RESULT_OK){
            val resultString = data!!.getStringExtra("result")
            resultTextView.text = "Response : $resultString"
        }
    }

    @SuppressLint("SetTextI18n")
    var detailLaauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == Activity.RESULT_OK){
            val data = it.data
            val resultString = data!!.getStringExtra("result")
            resultTextView.text = "Response : $resultString"

        }
    }

    private fun sendForReceiveResponseNew(){
        val car = Car(1, "Malibu")

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("car", car)
        detailLaauncher.launch(intent)
    }
}