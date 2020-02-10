package com.jonacorp.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homework1.*
import kotlinx.android.synthetic.main.activity_main.*

class Homework1Activity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework1)

        startUI()


    }

    fun startUI() {

        val bundle: Bundle? = intent.extras //stp3: Intent Extra
        //stp3: here we declare an empty intent EXTRA bundle that will be received from the
        //previous Activity
        val msg = bundle!!.getString("key_message")//stp4: Intent Extra
        //stp4: here we assign a variable "msg" to this empty "bundle",
        //and then we get the String bundle assigned as key "key_message"
        //and also we can say that this is not Empty bundle "!!"
        textView1.text = msg//stp5: Intent Extra
        //stp5: Here we're gonna make text ono this activity be same as text written
        // from Main Activity

        nextscreen.setOnClickListener {
            Toast.makeText(this, "HomeWork 1 - 2nd Screen...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Homework1ActivityS2::class.java)
            startActivity(intent)
        }
        homeView.setOnClickListener {
            Toast.makeText(this, "Back Home", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}