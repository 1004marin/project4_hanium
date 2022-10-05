package com.example.hanium2

import com.google.gson.annotations.SerializedName

data class LoginData(

    @field:SerializedName("userID") var userID: String,
    @field:SerializedName("userPwd") var userPwd: String
)