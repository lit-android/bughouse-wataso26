package app.nickname.myoji.bughouse

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import app.nickname.myoji.bughouse.count.CountActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CountActivityLaunchTest {

    @Test
    fun `CountActivityに遷移できるか`() {
        val scenario = launchActivity<CountActivity>()
        scenario.moveToState(Lifecycle.State.CREATED)
    }
}
