package com.abyxcz.mad_network.api

import com.google.gson.annotations.SerializedName

data class ItemRequest (
    @SerializedName("item")
    var item: ItemEntity,

)