package com.exe.api.repository

import com.exe.api.RetrofitServiceFactory
import com.exe.doordashlite.model.Restaurant

interface RestaurantBrowsingRemote {

    suspend fun getRestaurants(): List<Restaurant>
}

class RestaurantBrowsingRemoteImpl() : RestaurantBrowsingRemote {
    private val service = RetrofitServiceFactory.generateService()

    override suspend fun getRestaurants(): List<Restaurant> = service.getRestaurants()
}