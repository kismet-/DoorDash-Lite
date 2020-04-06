package com.exe.doordashlite.home.component

import android.util.Log
import androidx.compose.Composable
import androidx.core.graphics.drawable.toBitmap
import androidx.ui.core.Alignment
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.exe.doordashlite.ImageState
import com.exe.doordashlite.RemoteImage
import com.exe.doordashlite.loadImage
import com.exe.doordashlite.model.Restaurant
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async

@Composable
fun RestaurantListItem(restaurant: Restaurant) {

    val state = ImageState()

    GlobalScope.async {
        Log.i("--------","${restaurant.name} - ${restaurant.address.printableAddress} - ${restaurant.cover_img_url}")
        val drawable = loadImage(restaurant.cover_img_url ?: "")
        MainScope().async {
            state.image = RemoteImage(drawable.toBitmap())
        }
    }

    Clickable(onClick = {
        Log.i("-------------",  "-----CLICK")
    }) {
        Container(padding = EdgeInsets(left = 16.dp, top = 8.dp, right = 16.dp, bottom = 8.dp)) {
            Row(modifier = LayoutWidth.Fill) {
                Container(width = 80.dp, height = 40.dp) {
                    Clip(shape = RoundedCornerShape(4.dp)) {
                        DrawImage(image = state.image)
                    }
                }
                Container(
                    modifier = LayoutFlexible(1f) + LayoutPadding(8.dp),
                    alignment = Alignment.CenterLeft
                ) {
                    Column {
                        Text(
                            text = restaurant.name,
                            style = TextStyle(fontSize = 14.sp,fontWeight = FontWeight.Bold),
                            modifier = LayoutPadding(bottom = 4.dp)
                        )
                        Text(
                            text = restaurant.description,
                            style = TextStyle(fontSize = 11.sp),
                            maxLines = 1
                        )
                    }
                }
                Container(modifier = LayoutHeight.Fill) {
                    Column() {
                        Text(
                            text = restaurant.status,
                            style = TextStyle(fontSize = 11.sp),
                            modifier = LayoutHeight.Fill
                        )
                    }
                }
            }
        }
    }
}