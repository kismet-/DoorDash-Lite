package com.exe.doordashlite.home.component

import androidx.compose.Composable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.Divider
import com.exe.doordashlite.model.Restaurant

@Composable
fun RestaurantListView(restaurantList: List<Restaurant>) {
    VerticalScroller() {
        Column() {
            for (restaurant in restaurantList) {
                RestaurantListItem(restaurant = restaurant)
                Divider(color = Color.LightGray)
            }
        }
    }
//    AdapterList(data = restaurantList) {
//        item -> RestaurantListItem(restaurant = item)
//    }
}