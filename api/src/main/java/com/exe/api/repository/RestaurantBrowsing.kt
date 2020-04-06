package com.exe.api.repository

import com.exe.doordashlite.model.Restaurant
import retrofit2.http.GET

interface RestaurantBrowsing {
    @GET("restaurant/?lat=37.422740&lng=-122.139956")
    suspend fun getRestaurants(): List<Restaurant>
}