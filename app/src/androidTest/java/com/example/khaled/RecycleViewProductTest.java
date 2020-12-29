package com.example.khaled;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.doubleClick;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

@RunWith(AndroidJUnit4.class)
public class RecycleViewProductTest {
    @Rule
    public ActivityTestRule<HomeActivity> activityTestRule =
            new ActivityTestRule<>(HomeActivity.class);


    @Test
    public void row_Click() {
    onData(withId(R.id.recycler_menu)).perform(click());
    }
    @Test
    public void row_double() {
        onData(withId(R.id.recycler_menu)).perform(doubleClick());
    }


}