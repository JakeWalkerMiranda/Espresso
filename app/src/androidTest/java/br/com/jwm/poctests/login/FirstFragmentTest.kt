package br.com.jwm.poctests.login

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import br.com.jwm.poctests.MainActivity
import br.com.jwm.poctests.R
import br.com.jwm.poctests.robot.Robot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FirstFragmentTest {

    private val robot = Robot()

    @get:Rule
    val rule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun shouldPerformLoginWithSuccess() = with(robot) {
        checkIsDisplayedById(id = R.id.loginTitle)
        performTextAtId(id = R.id.name, text = NAME_SUCCESS)
        performTextAtId(id = R.id.password, text = PASSWORD_SUCCESS)
        performClickById(id = R.id.enter)
        checkIsDisplayedById(id = R.id.homeTitle)
    }

    private companion object {
        const val NAME_SUCCESS = "Jake Walker Miranda"
        const val PASSWORD_SUCCESS = "1234567890"
    }
}