import androidx.compose.Composable
import com.exe.doordashlite.common.component.ComposableView

interface UIComponent {
    @Composable
    fun composableView(): ComposableView
}