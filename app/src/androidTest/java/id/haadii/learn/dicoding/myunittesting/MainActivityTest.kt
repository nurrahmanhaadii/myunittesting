package id.haadii.learn.dicoding.myunittesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.action.ViewActions.typeText



@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private val dummyVolume = "504.0"
    private val dummyCircumference = "2016.0"
    private val dummySurfaceArea = "396.0"
    private val dummyLength = "12.0"
    private val dummyWidth = "7.0"
    private val dummyHeight = "6.0"
    private val emptyInput = ""
    private val fieldEmpty = "Field ini tidak boleh kosong"

    @Rule
    val mActivityRule : ActivityTestRule<MainActivity> = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun getCircumference() {
        onView(withId(R.id.edt_height)).perform(typeText(dummyHeight), closeSoftKeyboard())
        onView(withId(R.id.edt_length)).perform(typeText(dummyLength), closeSoftKeyboard())
        onView(withId(R.id.edt_width)).perform(typeText(dummyWidth), closeSoftKeyboard())

        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())

        onView(withId(R.id.btn_calculate_circumference)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_calculate_circumference)).perform(click())

        onView(withId(R.id.tv_result)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_result)).check(matches(withText(dummyCircumference)))
    }

    @Test
    fun getSurfaceAre() {
        onView(withId(R.id.edt_height)).perform(typeText(dummyHeight), closeSoftKeyboard())
        onView(withId(R.id.edt_length)).perform(typeText(dummyLength), closeSoftKeyboard())
        onView(withId(R.id.edt_width)).perform(typeText(dummyWidth), closeSoftKeyboard())

        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())

        onView(withId(R.id.btn_calculate_surface_area)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_calculate_surface_area)).perform(click())

        onView(withId(R.id.tv_result)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_result)).check(matches(withText(dummySurfaceArea)))
    }

    @Test
    fun getVolume() {
        onView(withId(R.id.edt_height)).perform(typeText(dummyHeight), closeSoftKeyboard())
        onView(withId(R.id.edt_length)).perform(typeText(dummyLength), closeSoftKeyboard())
        onView(withId(R.id.edt_width)).perform(typeText(dummyWidth), closeSoftKeyboard())

        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())

        onView(withId(R.id.btn_calculate_volume)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_calculate_volume)).perform(click())

        onView(withId(R.id.tv_result)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_result)).check(matches(withText(dummyVolume)))
    }

    @Test
    fun emptyInput() {
        onView(withId(R.id.edt_length)).perform(typeText(emptyInput), closeSoftKeyboard())
        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())
        onView(withId(R.id.edt_length)).check(matches(hasErrorText(fieldEmpty)))
        onView(withId(R.id.edt_length)).perform(typeText(dummyLength), closeSoftKeyboard())
        onView(withId(R.id.edt_width)).perform(typeText(emptyInput), closeSoftKeyboard())
        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())
        onView(withId(R.id.edt_width)).check(matches(hasErrorText(fieldEmpty)))
        onView(withId(R.id.edt_width)).perform(typeText(dummyWidth), closeSoftKeyboard())
        onView(withId(R.id.edt_height)).perform(typeText(emptyInput), closeSoftKeyboard())
        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())
        onView(withId(R.id.edt_height)).check(matches(hasErrorText(fieldEmpty)))
        onView(withId(R.id.edt_height)).perform(typeText(dummyHeight), closeSoftKeyboard())
        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())
    }
}