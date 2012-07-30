package com.tw28;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class UserTest
{

    @Test
    public void CheckUserIdMethodTest()
    {
        assertFalse(new User().checkUserId(1234));
    }


    @Test
    public void CheckPasswordMethodTest()
    {
        assertFalse(new User().checkPassword("1234"));
    }

    @Test
    public void CheckPasswordValidMethodTest()
    {
        assertTrue(new User().checkPassword("biblioteca1"));
    }

    @Test
    public void CheckUserIdValidMethodTest()
    {
        assertTrue(new User().checkUserId(56342));
    }
}
