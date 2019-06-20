package com.example.loginfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etusnm=findViewById<EditText>(R.id.etUsNm)
        val etpass=findViewById<EditText>(R.id.etPass)
        val btlgn=findViewById<Button>(R.id.btLgn)
        val btfb=findViewById<Button>(R.id.btfb)
        val btg=findViewById<Button>(R.id.btg)
        val txst=findViewById<TextView>(R.id.txst)

        btlgn.setOnClickListener{
            if(etusnm.text.toString()=="android" && etpass.text.toString()=="codekul")
            {
                txst.text="Login Successful"
            }
            else
            {
                txst.text="Login Failed"
            }
        }
        btg.setOnClickListener{
            txst.text="Log in through google"
        }
        btfb.setOnClickListener{
            txst.text= "Log in through facebook"
        }
    }
}
