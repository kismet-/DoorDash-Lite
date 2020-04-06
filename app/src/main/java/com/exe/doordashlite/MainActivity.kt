package com.exe.doordashlite

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.lifecycle.LiveData
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import com.exe.doordashlite.common.DdlTopAppBarComponent
import com.exe.doordashlite.common.component.render
import com.exe.doordashlite.home.component.HomePageUIModel
import com.exe.doordashlite.home.component.HomePageViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val vm: HomePageViewModel by viewModels()
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(vm)

        setContent {
            MaterialTheme {
                Column {
                    DdlTopAppBarComponent()
                    HomePage(vm.pageData)
                }
            }
        }
    }
}

@Composable
fun HomePage(homePageUIModelLiveData: LiveData<HomePageUIModel>) {
    Column() {
        Container() {
            val homePageUIModel =
                observe(data = homePageUIModelLiveData)
            homePageUIModel?.restaurantListUIComponents?.forEach { restaurantListUIComponent ->
                restaurantListUIComponent.composableView().render()
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        DdlTopAppBarComponent()
        HomePageViewModel()
    }
}