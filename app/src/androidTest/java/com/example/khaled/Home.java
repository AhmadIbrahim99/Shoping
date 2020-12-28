package com.example.khaled;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
//Hamza Abu Naqura
public class Home {
    @Rule

    public ActivityTestRule<HomeActivity> testRule =
            new ActivityTestRule<HomeActivity>(HomeActivity.class);

    @Test
    public void testrec(){//نشوف الريسايكل
        onView(withId(R.id.recycler_menu)).check(matches(isDisplayed()));
    }

}
