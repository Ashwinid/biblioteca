package com.tw28;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class TransactionTest {
    @Test
    public void storeTestInvalidIsbn() {
        try {
            assertFalse(new Transaction().store(1111111, 123));
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }

    @Test
    public void storeTestInvalidUserId() {
        try {
            assertFalse(new Transaction().store(123, 56342));
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }
    @Test
    public void storeTestValid() throws IOException {

            assertTrue(new Transaction().store(1111112, 56343));

}
    }
