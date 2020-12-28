package com.example.khaled;

import org.junit.Test;
//nafd
import static org.junit.Assert.assertTrue;

public class settings {

   SettinsActivity settinsActivity= new SettinsActivity();
   //Ahmed shahwan

    @Test
    public void test1()throws NullPointerException{
        //التحقق عند تغيير البيانات

        assertTrue(settinsActivity.checker.toString(),true);

    }

}
