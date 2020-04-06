package com.exe.api

import com.exe.api.repository.RestaurantBrowsingRemoteImpl
import com.exe.doordashlite.model.Restaurant
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Test

class RestaurantBrowsingRemoteImplTest {

    private val service = mockk<RetrofitServiceFactory>().generateService()

    private val repository = RestaurantBrowsingRemoteImpl()

    @Test
    fun getRestaurantsCompletesSuccessfully() {
        val restaurantResponse: List<Restaurant> = runBlocking { repository.getRestaurants() }
        runBlocking { service.getRestaurants() }
    }
}