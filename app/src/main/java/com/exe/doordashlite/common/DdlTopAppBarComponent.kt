package com.exe.doordashlite.common

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.foundation.Box
import androidx.ui.graphics.Color
import androidx.ui.layout.Container
import androidx.ui.material.TopAppBar
import androidx.ui.text.TextStyle
import androidx.ui.unit.dp

/// A [DdlTopAppBarComponent]
@Composable
fun DdlTopAppBarComponent(
) {
    TopAppBar(title = {
        Text(text = "Discover", style = TextStyle(
            color = Color.White))
    },
        color = Color(red = 254, green = 25, blue = 65),
        navigationIcon = {
            Box(backgroundColor = Color(red = 236, green = 51, blue = 35), children = {
                Container(width = 40.dp, height = 40.dp) {
            }}
            )}
            )
        }


