package com.example.khaled;

import org.junit.Assert;
import org.junit.Test;
//hamza
public class checkValidPhonePasswordTest {

    @Test
    public void ValidphonePassword(){
        RegisterActivity r=new RegisterActivity();
       boolean isValid=r.IsValidation("059999999","2341*45");
        System.out.println(isValid);
        Assert.assertTrue(isValid);
    }
}
