package com.example.myapplication.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.myapplication.R

class LoginPage {

    fun setUserName(name: String): LoginPage {
        onView(withId(R.id.username)).perform(typeText(name))
        return this
    }

    fun setUserPassword(pass: String): LoginPage {
        onView(withId(R.id.password)).perform(typeText(pass))
        return this
    }

    fun checkPass(): LoginPage
    {
        onView(withId(R.id.password)).check(ViewAssertions.matches(withText("456321")))
        return this
    }

    fun checkLoginButtonIsEnabled() : LoginPage
    {
        onView(ViewMatchers.withId(R.id.login)).check(ViewAssertions.matches(isEnabled()))
        return this
    }

}