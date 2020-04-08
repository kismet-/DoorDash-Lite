package com.exe.api

import com.exe.api.mocks.GenerateRemoteTestData
import com.exe.api.repository.RestaurantBrowsingRemoteImpl
import com.exe.doordashlite.model.Restaurant
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.runBlocking
import org.junit.Test

class RestaurantBrowsingRemoteImplTest {

    private val repository = mockk<RestaurantBrowsingRemoteImpl>()

    /// Tests repository for Restaurant response.
    @Test
    fun getRestaurantsCompletesSuccessfully() {
        val restaurant = mutableListOf<Restaurant>()
        restaurant.add(GenerateRemoteTestData.generateSessionRestaurant())
        every { runBlocking { repository.getRestaurants() } } returns restaurant

        runBlocking { repository.getRestaurants() }

        verify {
            runBlocking { repository.getRestaurants() }
        }
    }
}