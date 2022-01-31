package br.com.jwm.poctests.home

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.rules.ActivityScenarioRule
import br.com.jwm.poctests.MainActivity
import br.com.jwm.poctests.R
import br.com.jwm.poctests.SecondFragment
import br.com.jwm.poctests.robot.Robot
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class SecondFragmentTest {

    private val robot = Robot()

    @get:Rule
    val rule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setupFragment() {
        launchFragmentInContainer<SecondFragment>()
    }
    @Test
    fun shouldCheckHomeScreen() = with(robot) {
        checkIsDisplayedById(id = R.id.homeTitle)
        performClickById(id = R.id.action)
        checkTextById(id = R.id.actionText, text = "Bem vindo!")
    }
}