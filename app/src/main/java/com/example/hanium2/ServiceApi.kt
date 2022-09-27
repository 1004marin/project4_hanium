package com.example.hanium2



import com.example.hanium2.LoginData
import com.example.hanium2.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ServiceApi {
    @POST("/user/login")
    fun userLogin(@Body data: LoginData?): Call<LoginResponse?>?

//    @POST("/user/join")
//    fun userJoin(@Body data: JoinData?): Call<JoinResponse?>?
}