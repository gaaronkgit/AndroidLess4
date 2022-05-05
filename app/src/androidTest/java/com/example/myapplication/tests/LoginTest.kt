package com.example.myapplication.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.myapplication.pages.LoginPage
import com.example.myapplication.ui.login.LoginActivity
import org.junit.Rule
import org.junit.Test

class LoginTest
{
    @get:Rule
    val actRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test fun CheckLoginButton()
    {
        LoginPage().setUserName("Stepan")
            .setUserPassword("456321")
            .checkPass()
            .checkLoginButtonIsEnabled()
    }
}