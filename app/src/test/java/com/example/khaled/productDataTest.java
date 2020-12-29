package com.example.khaled;

import com.example.khaled.Admin.AdminAddNewProductActivity;

import org.junit.Assert;
import org.junit.Test;

//hamza
public class productDataTest {
    @Test
    public void testProductData(){
        AdminAddNewProductActivity a=new AdminAddNewProductActivity();
        boolean  v=a.IsProductData("","","book");
        Assert.assertFalse(v);
    }
    @Test
    public void testProductData1(){
        AdminAddNewProductActivity a=new AdminAddNewProductActivity();
        boolean  v=a.IsProductData("new book","60","book");
        Assert.assertTrue(v);

    }
}
