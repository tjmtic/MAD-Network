package com.abyxcz.mad_network.api

import com.google.gson.annotations.SerializedName
import java.util.UUID

data class ItemEntity(
    var pk: Long = 0,
    @SerializedName("_id")
    val id: String,
    @SerializedName("id")
    val itemId: String?
)
