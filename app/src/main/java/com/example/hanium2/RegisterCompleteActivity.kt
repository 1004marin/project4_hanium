package com.example.hanium2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.hanium2.HomeActivity
import kotlinx.android.synthetic.main.activity_register_complete.*


class RegisterCompleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_complete)


        findViewById<View>(com.example.hanium2.R.id.tomain).setOnClickListener {
            val intent = Intent(this@RegisterCompleteActivity, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}

