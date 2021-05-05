package com.example.healthandfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bmiactivity1.*
import kotlinx.android.synthetic.main.activity_exercise.*
import kotlinx.android.synthetic.main.activity_main.*

class bmiactivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmiactivity1)

        setSupportActionBar(toolbar)
        val actionbar = supportActionBar
        if (actionbar != null)
            actionbar.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        bmicalc.setOnClickListener {
            if(weighttext.text.toString()=="" || heighttext.text.toString()==""){
                Toast.makeText(this,"info incomplete",Toast.LENGTH_SHORT).show()
            }
            else{
           var we=weighttext.text.toString()
            var he=heighttext.text.toString()
           var w= we
            var h= he

            bmitext.text= (w.toDouble() /((h.toDouble())*(h.toDouble()))).toString()
        }
        }
    }

}