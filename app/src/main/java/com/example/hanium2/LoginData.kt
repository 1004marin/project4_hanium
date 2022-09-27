package com.example.hanium2

import com.google.gson.annotations.SerializedName

data class LoginData(
    @field:SerializedName("userEmail") var userEmail: String, @field:SerializedName(
        "userPwd"
    ) var userPwd: String
)