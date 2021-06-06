package app.nickname.myoji.bughouse

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import app.nickname.myoji.bughouse.load.LoadActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoadActivityLaunchTest {

    @Test
    fun `LoadActivityに遷移できるか`() {
        val scenario = launchActivity<LoadActivity>()
        scenario.moveToState(Lifecycle.State.CREATED)
    }
}
