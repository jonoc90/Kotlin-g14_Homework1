package com.jonacorp.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startUI()

    }

    //******************************* Start UI ***********************************************

    fun startUI(){
        //Start code method
        btnHomework1.setOnClickListener {
            showLog("LG: button HMW1 clicked") // -> Only Developers
            Toast.makeText(this, "HomeWork 1 it is...",Toast.LENGTH_LONG).show()

            val mestext:String=editText1.text.toString()//stp1: Intent Extra
            //stp1: we extracted TEXT message typed from mainActivity and convert it to string

            //...... open other activity (app screen)...
            val intent = Intent(this, Homework1Activity::class.java)

            intent.putExtra("key_message",mestext)//stp2: Intent Extra
            //spt2: with this putExtra we intent to extract an extra parameter.
            //we declared its unique KEY and the final message we wanna show
            //on our target activity (now lets move to the target activity class)

            startActivity(intent)//start or show new Target screen (EXPLICIT intent)
            //..... end open app screen ....

        }


        btnHomework2.setOnClickListener {
            showLog("LG: button HMW2 clicked") // -> Only Developers
            Toast.makeText(this, "HomeWork 2 it is...",Toast.LENGTH_LONG).show()
        }
    }

    // ***************************** END UI *************************************************

/*
* In this secttion we're gonna add complementary functions for the app...
* */


   //-------- Logs Method for Developers --------
    fun showLog(message:String){
        if (BuildConfig.DEBUG){
            Log.v("CONSOLE", message)
        }
    }
    //----------- END Log -------------------





}
