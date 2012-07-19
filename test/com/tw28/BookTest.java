package com.tw28;

import org.junit.Test;

import java.io.IOException;


public class BookTest {
    @Test
    public void testGetName() throws Exception {
        for(int i=0;i<5;i++)
        assert(new Book().GetName(i)!= null);
    }

    @Test
    public void testGetAuthorName() throws Exception {
        for(int i=0;i<5;i++)
        assert(new Book().GetAuthorName(i)!= null);
    }


    @Test
    public void testGetReserveStatus() throws Exception {
        for(int i=0;i<5;i++)
            assert(new Book().GetReserveStatus(i)!= null);
    }

    @Test
    public void testReserveInvalidIsbn()
    {    int x;
        try {
            assert (new Book().Reserve(123,1111111)==0);
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }

    @Test
    public void testReserveInvalidUserId()
    {    int x;
        try {
            assert (new Book().Reserve(56342,123)==0);
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }

    @Test
    public void testReserveValidParameters()
    {    int x;
        try {
            assert (new Book().Reserve(56342,1111112)==1);
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }

}
