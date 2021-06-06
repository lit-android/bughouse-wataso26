package app.nickname.myoji.bughouse.matchers

import android.view.View
import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description
import org.hamcrest.Matcher

fun withRecyclerViewItemSize(expectedSize: Int): Matcher<View> {
    return object : BoundedMatcher<View, View>(View::class.java) {
        override fun describeTo(description: Description?) {
            description?.appendText("with RecyclerView item size: ")
            description?.appendValue(expectedSize)
        }

        override fun matchesSafely(item: View?): Boolean {
            if (item !is RecyclerView) return false

            return item.adapter?.itemCount == expectedSize
        }
    }
}

fun <T : View> matchesAtPosition(position: Int, @IdRes targetViewById: Int, itemMatcher: Matcher<View>): Matcher<View> {
    return object : BoundedMatcher<View, View>(View::class.java) {
        override fun describeTo(description: Description?) {
            description?.appendText("at $position on View: ")
        }

        override fun matchesSafely(item: View?): Boolean {
            if (item !is RecyclerView) return false
            val viewHolder = item.findViewHolderForAdapterPosition(position)
            val targetView = viewHolder?.itemView?.findViewById<T>(targetViewById)
            return itemMatcher.matches(targetView)
        }
    }
}
