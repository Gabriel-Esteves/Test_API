package com.test_api

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PullRequest : Serializable {
    @SerializedName("title") val title_: String? = ""
    @SerializedName("created_at") val created_at: String? = ""
    @SerializedName("body") val body: String? = ""
    @SerializedName("user") val owner: String? = ""
    @SerializedName("html_url") val url: String? = ""
}

