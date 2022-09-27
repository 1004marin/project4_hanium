package com.example.hanium2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginActivity : AppCompatActivity() {
    private var mEmailView: EditText? = null
    private var mPasswordView: EditText? = null
    private var mEmailLoginButton: Button? = null
    private var service: ServiceApi? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mEmailView = findViewById<View>(R.id.login_email) as EditText
        mPasswordView = findViewById<View>(R.id.login_password) as EditText
        mEmailLoginButton = findViewById<View>(R.id.login_button) as Button
        service = RetrofitClient.client?.create(ServiceApi::class.java)
        mEmailLoginButton!!.setOnClickListener { attemptLogin() }
    }
    private fun attemptLogin() {
        mEmailView!!.error = null
        mPasswordView!!.error = null
        val email = mEmailView!!.text.toString()
        val password = mPasswordView!!.text.toString()
        var cancel = false
        var focusView: View? = null

        // 패스워드의 유효성 검사(생략?
        if (password.isEmpty()) {
            mEmailView!!.error = "비밀번호를 입력해주세요."
            focusView = mEmailView
            cancel = true
        } else if (!isPasswordValid(password)) {
            mPasswordView!!.error = "6자 이상의 비밀번호를 입력해주세요."
            focusView = mPasswordView
            cancel = true
        }

        // 이메일의 유효성 검사 (생략?
        if (email.isEmpty()) {
            mEmailView!!.error = "이메일을 입력해주세요."
            focusView = mEmailView
            cancel = true
        } else if (!isEmailValid(email)) {
            mEmailView!!.error = "@를 포함한 유효한 이메일을 입력해주세요."
            focusView = mEmailView
            cancel = true
        }
        if (cancel) {
            focusView!!.requestFocus()
        } else {
            startLogin(LoginData(email, password))
        }
    }

    private fun startLogin(data: LoginData) {
        service?.userLogin(data)?.enqueue(object : Callback<LoginResponse?> {
            override fun onResponse(call: Call<LoginResponse?>?, response: Response<LoginResponse?>) {
                val result: LoginResponse? = response.body()
                if (result != null) {
                    Toast.makeText(this@LoginActivity, result.getMessage(), Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<LoginResponse?>?, t: Throwable) {
                Toast.makeText(this@LoginActivity, "로그인 에러 발생", Toast.LENGTH_SHORT).show()
                Log.e("로그인 에러 발생", t.message!!)
            }
        })
    }

    private fun isEmailValid(email: String): Boolean {
        return email.contains("@")
    }

    private fun isPasswordValid(password: String): Boolean {
        return password.length >= 6
    }


}