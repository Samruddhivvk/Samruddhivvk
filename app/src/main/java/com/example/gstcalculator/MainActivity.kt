package com.example.gstcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val amt = findViewById<EditText>(R.id.amt)
        val igst = findViewById<Button>(R.id.igst)
        val sgst = findViewById<Button>(R.id.sgst)
        val cgst= findViewById<Button>(R.id.cgst)
        val netamt = findViewById<TextView>(R.id.netamt)
        val gst = findViewById<TextView>(R.id.gst)
        igst.setOnClickListener {
            gst.text = "GST:" + (((amt.text.toString().toFloat()) * 18) / 100)
            netamt.text = "Amount including GST:" + (amt.text.toString().toFloat() + (((amt.text.toString().toFloat()) * 18) / 100))
        }
        cgst.setOnClickListener {
            gst.text = "GST:" + (((amt.text.toString().toFloat()) * 9) / 100)
            netamt.text = "Amount including GST:" + (amt.text.toString().toFloat() + (((amt.text.toString().toFloat()) * 9) / 100))
        }
        sgst.setOnClickListener {
            gst.text = "GST:" + (((amt.text.toString().toFloat()) * 9) / 100)
            netamt.text = "Amount including GST:" + (amt.text.toString().toFloat() + (((amt.text.toString().toFloat()) * 9) / 100))
        }

    }
}