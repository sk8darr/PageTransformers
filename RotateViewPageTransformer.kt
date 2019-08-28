import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.viewpager2.widget.ViewPager2


class RotateViewPageTransformer : ViewPager2.PageTransformer {

    override fun transformPage(view: View, position: Float) {

        when {
            position <= 1 -> {
                    //REPLACE WITH YOUR VIEW ID
                val image = view.findViewById<AppCompatImageView>(R.id.image)
                image.rotation = position * 40F
                view.alpha = 1F
                view.pivotY = view.height * 0.5f
                view.rotationY = 13f * position
            }
            else -> {
                view.alpha = 0F
            }
        }
    }
}
