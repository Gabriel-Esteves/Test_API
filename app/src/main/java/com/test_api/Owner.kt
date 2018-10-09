package com.test_api

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Owner : Serializable {
    @SerializedName("login") val login: String? = ""
    @SerializedName("avatar_url") val avatarUrl: String? = ""
}