package com.jdapplications.emulatorsdroidconpl

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class) class MainActivityTest {

    @get:Rule val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test fun changesTextWhenClickingButton() {
        onView(withId(R.id.press_me_button))
                .perform(click())
        onView(withId(R.id.change_text_text)).check(matches(withText("First")))
        onView(withId(R.id.press_me_button))
                .perform(click())
        onView(withId(R.id.change_text_text)).check(matches(withText("Second")))
    }

}