package com.jeongdaeri.inheritancepractice

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        Toast.makeText(this, "호호호", Toast.LENGTH_SHORT).show()

    }

}
