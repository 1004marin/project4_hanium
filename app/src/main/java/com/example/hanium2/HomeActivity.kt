package com.example.hanium2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<View>(R.id.btn_r).setOnClickListener {
            val intent = Intent(this@HomeActivity, RegisterActivity::class.java)
            //intent.putExtra("키", "메시지") 메시지를 키로 잠갔다.
            startActivity(intent)
        }

        findViewById<View>(R.id.button7).setOnClickListener {
            val intent = Intent(this@HomeActivity,OpenActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.button5).setOnClickListener {
            val intent = Intent(this@HomeActivity,ListActivity::class.java )
            startActivity(intent)

        }

        findViewById<View>(R.id.button6).setOnClickListener {
            val intent = Intent(this@HomeActivity,LogActivity::class.java )
            startActivity(intent)
        }
        findViewById<View>(R.id.button8).setOnClickListener {
            val intent = Intent(this@HomeActivity, LoginActivity::class.java)
            //intent.putExtra("키", "메시지") 메시지를 키로 잠갔다.
            startActivity(intent)
        }
    }
}