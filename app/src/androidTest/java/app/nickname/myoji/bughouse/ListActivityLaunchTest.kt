package app.nickname.myoji.bughouse

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import app.nickname.myoji.bughouse.list.ListActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ListActivityLaunchTest {

    @Test
    fun `ListActivityに遷移できるか`() {
        val scenario = launchActivity<ListActivity>()
        scenario.moveToState(Lifecycle.State.CREATED)
    }
}
