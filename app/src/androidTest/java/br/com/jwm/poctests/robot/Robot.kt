package br.com.jwm.poctests.robot

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

class Robot {

    fun checkIsDisplayedById(@IdRes id: Int) {
        onView(withId(id)).check(matches(isDisplayed()))
    }

    fun checkTextById(@IdRes id: Int, text: String) {
        onView(withId(id))
            .check(matches(isDisplayed()))
            .check(matches(withText(text)))
    }

    fun performTextAtId(@IdRes id: Int, text: String) {
        onView(withId(id)).perform(typeText(text))
        closeSoftKeyboard()
    }

    fun performClickById(@IdRes id: Int) {
        onView(withId(id)).perform(click())
    }
}