package com.example.batteryalert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var time = System.currentTimeMillis()
        var t=time.toInt()
        t/=1000;
        t/=60;
        t/=60;
        disp.text=t.toString()
    }
}