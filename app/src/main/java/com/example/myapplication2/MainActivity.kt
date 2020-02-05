package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById(R.id.tv) as TextView
        tv.setText("Hello Kotlin")
        tv2.setText("Hello World")

        var button: Button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            var temp:String? = null
            temp = tv.text.toString()
            tv.setText(tv2.text)
            tv2.setText(temp)
        })

    }
}
