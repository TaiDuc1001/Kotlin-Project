package com.example.affirmations

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

class AffirmationsListTests {
    @RunWith(AndroidJUnit4::class)
    @get: Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

}