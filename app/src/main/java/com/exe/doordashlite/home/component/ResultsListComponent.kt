import com.exe.doordashlite.common.component.ComposableView
import com.exe.doordashlite.home.component.RestaurantListView
import com.exe.doordashlite.model.Restaurant

class RestaurantListUIComponent(
    private val restaurantList: List<Restaurant>
) : UIComponent {

    override fun composableView(): ComposableView = {
        RestaurantListView(restaurantList = restaurantList)
    }
}