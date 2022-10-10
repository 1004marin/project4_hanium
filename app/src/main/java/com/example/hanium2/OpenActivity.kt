package com.example.hanium2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class OpenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open2)

        findViewById<View>(R.id.button4).setOnClickListener {

            Toast.makeText(this@OpenActivity,"도어락이 개방되었습니다.", Toast.LENGTH_SHORT).show()
        }
    }


}