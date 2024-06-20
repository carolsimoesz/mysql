package com.example.mysql.api
//Nilton Barros
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    private const val BASE_URL = "http://10.86.141.2/api/"
    //private const val BASE_URL = "http://192.168.15.7/api/"

    fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    }
}