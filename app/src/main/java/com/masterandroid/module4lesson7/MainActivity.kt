package com.masterandroid.module4lesson7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b_click:Button = findViewById(R.id.b_click)

        b_click.setOnClickListener {
            openTask3()
//            openTask4()
//            openTask5()
//            openTask6()
        }
    }

    private fun openTask3() {
        val intent = Intent(this,Task3::class.java)
        startActivity(intent)
    }

      private fun openTask4() {
        val intent = Intent(this,Task4::class.java)
        startActivity(intent)
    }

      private fun openTask5() {
        val intent = Intent(this,Task5::class.java)
        startActivity(intent)
    }

      private fun openTask6() {
        val intent = Intent(this,Task6::class.java)
        startActivity(intent)
    }



}