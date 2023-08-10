package com.example.apicalling
import retrofit2.Call
import retrofit2.http.GET
interface ApiInterface {
    @GET("users")
    fun getProductData() : Call<MyData>
}