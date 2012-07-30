package com.tw28;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;


public class BookTest {


    @Test
    public void testReserveInvalidIsbn()
    {    int x;
        try {
            assertEquals(new Book().Reserve(123,1111111),0);
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }

    @Test
    public void testReserveInvalidUserId()
    {    int x;
        try {
            assertEquals(new Book().Reserve(56342, 123), 0);
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }

    @Test
    public void testReserveValidParameters()
    {    int x;
        try {
            assertEquals(new Book().Reserve(56342,1111112),1);
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }



}
