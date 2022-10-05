package com.example.hanium2

import com.google.gson.annotations.SerializedName

data class LoginData(

    @field:SerializedName("Manager_id") var Manager_id: String,
    @field:SerializedName("Manager_pwd") var Manager_pwd: String
)