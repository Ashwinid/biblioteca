package com.tw28;


import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class LibraryTest {

    @Test
    public void CheckUserIdMethodTest()
    {
        assertFalse(new Library().checkUserId(1234));
    }

    @Test
    public void CheckIsbnMethodTest()
    {
        assertFalse(new Library().checkUserId(57445));
    }


    @Test
    public void CheckIsbnMethodValidTest()
    {
        assertTrue(new Library().checkUserId(56343));
    }

    @Test
    public void CheckStoreMethodValidTest() throws IOException {
        assertTrue(new Library().store(1111111, 56343));
    }
}
