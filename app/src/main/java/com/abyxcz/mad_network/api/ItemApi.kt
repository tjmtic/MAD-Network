package com.abyxcz.mad_network.api

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ItemApi {

    //////GET////////
    @GET("api/get/item")
    suspend fun getItem(): Response<JsonObject>

    @GET("api/get/items")
    suspend fun getItems(): Response<JsonArray>

    @POST("api/login")
    suspend fun postLogin(
        @Body request: LoginRequest
    ): Response<JsonObject>
}