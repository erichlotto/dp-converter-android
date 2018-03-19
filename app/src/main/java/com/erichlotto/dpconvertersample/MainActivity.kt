package com.erichlotto.dpconvertersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.erichlotto.dpconverter.Dp
import com.erichlotto.dpconverter.toDp
import com.erichlotto.dpconverter.toPx

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Usage is very simple:
        Log.d("DEBUG", "100px = " + Dp.fromPx(100f) + "dp")
        Log.d("DEBUG", "100dp = " + Dp.toPx(100f) + "px")

        //Or we can use extension functions:
        Log.d("DEBUG", "100px = " + 100f.toDp() + "dp")
        Log.d("DEBUG", "100dp = " + 100f.toPx() + "px")
    }
}
