package com.exe.doordashlite.home.component

import RestaurantListUIComponent
import androidx.compose.Model
import androidx.lifecycle.*
import com.exe.api.repository.RestaurantBrowsingRemoteImpl

import com.exe.doordashlite.model.Restaurant
import kotlinx.coroutines.launch

class HomePageViewModel : ViewModel(), LifecycleObserver {

    var pageData: MutableLiveData<HomePageUIModel> = MutableLiveData()
    private val repository = RestaurantBrowsingRemoteImpl()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun load() {
        pageData.value = HomePageUIModel()
        restaurantsLoader() { repository.getRestaurants() }
    }

    private fun restaurantsLoader(loader: suspend () -> List<Restaurant>) {
        viewModelScope.launch {
            val restaurants = loader.invoke()
            addRestaurantsList(RestaurantListUIComponent(restaurants))
        }
    }

    private fun addRestaurantsList(restaurantListUIComponent: RestaurantListUIComponent) {
        val updatedRestaurantsListUIComponents = run {
            val restaurantListUIComponents =
                pageData.value?.restaurantListUIComponents ?: arrayListOf()

            restaurantListUIComponents.add(restaurantListUIComponent)
            restaurantListUIComponents
        }
        pageData.postValue(HomePageUIModel(restaurantListUIComponents = updatedRestaurantsListUIComponents))
    }
}

@Model
data class HomePageUIModel(
    val restaurantListUIComponents: ArrayList<RestaurantListUIComponent> = arrayListOf()
)