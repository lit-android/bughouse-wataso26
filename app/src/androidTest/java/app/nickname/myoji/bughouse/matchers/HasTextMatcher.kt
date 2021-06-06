package app.nickname.myoji.bughouse.matchers

import android.view.View
import android.widget.TextView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description
import org.hamcrest.Matcher

fun hasText(): Matcher<View> {
    return object : BoundedMatcher<View, View>(View::class.java) {
        override fun describeTo(description: Description?) {
            description?.appendText("has text")
        }

        override fun matchesSafely(item: View?): Boolean {
            if ((item is TextView).not()) return false

            val targetText = item as TextView
            return targetText.text.isNotEmpty()
        }

    }
}
