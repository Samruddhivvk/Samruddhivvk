package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etnum1=findViewById<EditText>(R.id.etNumber1)
        val etnum2=findViewById<EditText>(R.id.etNumber2)
        val btadd=findViewById<Button>(R.id.btadd)
        val btsub=findViewById<Button>(R.id.btsub)
        val btmul=findViewById<Button>(R.id.btmul)
        val btdiv=findViewById<Button>(R.id.btdiv)
        val txtr=findViewById<TextView>(R.id.txtr)

        btadd.setOnClickListener{
            txtr.text= ""+ (Integer.parseInt(etnum1.text.toString()) + Integer.parseInt(etnum2.text.toString()))
        }
        btsub.setOnClickListener{
            txtr.text=""+(Integer.parseInt(etnum1.text.toString()) - Integer.parseInt(etnum2.text.toString()))
        }
        btmul.setOnClickListener{
            txtr.text= ""+(Integer.parseInt(etnum1.text.toString()) * Integer.parseInt(etnum2.text.toString()))
        }
        btdiv.setOnClickListener{
            txtr.text=""+( Integer.parseInt(etnum1.text.toString()) / Integer.parseInt(etnum2.text.toString()))
        }
    }
}
