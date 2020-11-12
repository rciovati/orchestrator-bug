package com.example.orchestratorbug

import android.util.Log
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.*

@RunWith(Parameterized::class)
class ExampleInstrumentedTest(private val value: Boolean) {

    @JvmField
    val activityRule = ActivityTestRule(MainActivity::class.java, false, true)

    @Before
    fun setUp() {
        activityRule.launchActivity(null)
    }

    @Test
    fun testOne() {
        Log.d("asdf", "test one... value: $value")
    }

    @Test
    fun testTwo() {
        Log.d("asdf", "test two... value: $value")
    }

    companion object {
        @Parameters
        @JvmStatic
        fun input(): Collection<Boolean> {
            return listOf(false, true)
        }
    }
}
