package com.example.hanium2

import com.google.gson.annotations.SerializedName

data class LoginResponse( @field:SerializedName("code") private var code: Int,
                          @field:SerializedName("message") private var message: String
                          //,@field:SerializedName("Manager_id") private var userID: Int
    )

{fun getMessage(): String?{
    return message
}}