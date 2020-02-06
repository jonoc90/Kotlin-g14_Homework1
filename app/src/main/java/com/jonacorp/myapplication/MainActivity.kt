package com.jonacorp.myapplication

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
// I add this line for Second version of Github coded as "Git_V2"
    fun startUI(){
        //Start code method
        btnShowToast.setOnClickListener {
            showLog("Toast button clicked") // -> Only Developers
            Toast.makeText(this, "Toast clicked",Toast.LENGTH_LONG).show()
        }
    }

/*
* In this secttion we're gonna add complementary functions for the app...
* */
   //-------- Logs Method for Developers --------
    fun showLog(message:String){
        if (BuildConfig.DEBUG){
            Log.v("CONSOLE", message)
        }
    }   //----------- END Log -------------------





}
