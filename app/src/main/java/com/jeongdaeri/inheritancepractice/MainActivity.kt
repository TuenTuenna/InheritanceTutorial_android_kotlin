package com.jeongdaeri.inheritancepractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        second_activity_btn.setOnClickListener {
            val secondActivityIntent = Intent(this, SecondActivity::class.java)
            startActivity(secondActivityIntent)
        }

        third_activity_btn.setOnClickListener {
            val thirdActivityIntent = Intent(this, ThirdActivity::class.java)
            startActivity(thirdActivityIntent)
        }

    }




}
