package com.example.khaled;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class MainTest {
    @Rule

    public ActivityTestRule<MainActivity> testRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void Login_btn(){
        onView(withId(R.id.main_login_btn)).perform(click());
    }
    @Test
    public void register_btn(){
        onView(withId(R.id.main_join_now_btn)).perform(click());
    }

}
