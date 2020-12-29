package com.example.khaled;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Collection;
//hamza
@RunWith(Parameterized.class)

public class ParametrizeTest {
    private String x;
    private String y;
    private boolean result;
    private RegisterActivity instance;
    public ParametrizeTest(String x, String y, boolean result) {
        this.x = x;
        this.y = y;
        this.result = result;
        instance=new RegisterActivity();
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "05988888", "1234567",true }, {"567890", "45678765", false}, {"05988888", "567", false}
        });
    }
    @Test
    public void shouldReturn() {
        boolean actual = instance.IsValidation(x, y);
        Assert.assertEquals(actual,result);
    }
}
