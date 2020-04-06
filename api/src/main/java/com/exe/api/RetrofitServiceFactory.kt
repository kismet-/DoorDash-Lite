package com.exe.api

import com.exe.api.repository.RestaurantBrowsing
import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitServiceFactory {
    fun generateService(): RestaurantBrowsing {
        val okHttpClient = makeOkHttpClient()
        return generateService(okHttpClient, Gson())
    }

    private fun generateService(okHttpClient: OkHttpClient, gson: Gson): RestaurantBrowsing {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.doordash.com/v2/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        return retrofit.create(RestaurantBrowsing::class.java)
    }

    private fun makeOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }
}