package com.example.khaled;

import android.content.Context;

import androidx.annotation.ContentView;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule

    public ActivityTestRule<LoginActivity> testRule =
            new ActivityTestRule<LoginActivity>(LoginActivity.class);


    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.khaled", appContext.getPackageName());
    }
    @Test
    public void user_can_enter_Password(){
        onView(withId(R.id.login_password_input)).perform(typeText("Ahmad"));
    }
    @Test
    public void user_can_enter_phone_Number(){
        onView(withId(R.id.login_phone_number_input)).perform(typeText("0597674243"));
    }

}