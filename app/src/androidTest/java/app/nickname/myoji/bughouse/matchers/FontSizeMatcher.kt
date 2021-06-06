package app.nickname.myoji.bughouse.matchers

import android.content.res.Resources
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description
import org.hamcrest.Matcher

fun withFontSize(expectedFontSp: Float): Matcher<View> {
    return object : BoundedMatcher<View, View>(View::class.java) {
        override fun describeTo(description: Description?) {
            description?.appendText("with fontSize: ")
            description?.appendValue(expectedFontSp)
        }

        override fun matchesSafely(item: View?): Boolean {
            if (item !is TextView) return false

            val pixels = item.textSize
            val actualSize = pixels / item.resources.displayMetrics.scaledDensity
            return expectedFontSp == actualSize
        }
    }
}

val Float.dp get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, Resources.getSystem().displayMetrics)
val Float.sp get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, this, Resources.getSystem().displayMetrics)
val Int.dp get() = toFloat().dp.toInt()
val Int.sp get() = toFloat().sp.toInt()
