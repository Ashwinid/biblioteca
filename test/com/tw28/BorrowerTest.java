package com.tw28;

import org.junit.Test;

import java.io.IOException;

public class BorrowerTest {
    @Test
    public void storeTestInvalidIsbn() {
        try {
            assert(new Borrower().store(1111111,123));
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }

    @Test
    public void storeTestInvalidUserId() {
        try {
            assert(new Borrower().store(123,56342));
        } catch (IOException e) {
            System.out.println("Invalid data");
        }
    }
    @Test
    public void storeTestValid() throws IOException {

            assert(new Borrower().store(1111112,56343));

}
    }
