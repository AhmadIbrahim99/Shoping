package com.example.khaled;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
//naja Made
public class Login {
    @Rule

    public ActivityTestRule<LoginActivity> testRule =
            new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void user_can_enter_Password(){
        onView(withId(R.id.login_password_input)).perform(typeText("Ahmad"));
    }
    @Test
    public void user_can_enter_phone_Number(){
        onView(withId(R.id.login_phone_number_input)).perform(typeText("0597674243"));
    }
    @Test
    public void login(){
        onView(withId(R.id.login_btn)).perform(click());
    }



}
