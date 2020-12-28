package com.example.khaled;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

//khaled tawil class

public class Regclasstest {
    @Rule

    public ActivityTestRule<RegisterActivity> testRule =
            new ActivityTestRule<RegisterActivity>(RegisterActivity.class);

    @Test
    public void user_can_enter_Name(){
        onView(withId(R.id.register_username_input)).perform(typeText("khaled"));
    }
    @Test
    public void user_can_enter_phone_Number(){
        onView(withId(R.id.register_phone_number_input)).perform(typeText("0595129080"));
    }
    @Test
    public void user_can_enter_Password(){
        onView(withId(R.id.register_password_input)).perform(typeText("kh123456789***"));
    }
    @Test
    public void register(){
        onView(withId(R.id.register_btn)).perform(click());
    }


}
