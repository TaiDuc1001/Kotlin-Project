package com.example.wordsapp

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTests {
    @Test
    fun navigate_to_words_nav_component(){
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )
        val letterListScenario = launchFragmentInContainer<LetterListFragment>(themeResId =
        R.style.Theme_Words)
        letterListScenario.onFragment { fragment ->

            navController.setGraph(R.navigation.nav_graph)

            Navigation.setViewNavController(fragment.requireView(), navController)
        }
        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)
    }
}