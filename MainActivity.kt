package com.example.tuan4

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationtuan1.R
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btnGet=findViewById<Button>(R.id.btnGetData)
        var TvKq=findViewById<TextView>(R.id.TvKq)
        val fn1 =VolleyFn1()
        btnGet!!.setOnClickListener{
            fn1.getAllData(context, TvKq!!)
        }
    }
}