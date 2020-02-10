package com.jonacorp.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homework1.*
import kotlinx.android.synthetic.main.activity_homework1_s2.*
import kotlinx.android.synthetic.main.activity_main.*

class Homework1ActivityS2:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework1_s2)

        startUI()


    }

    fun startUI() {

        imageHome.setOnClickListener {
            Toast.makeText(this, "Back Home", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }





    }

}