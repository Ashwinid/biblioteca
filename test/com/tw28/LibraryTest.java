package com.tw28;

import org.junit.Test;

public class LibraryTest {

    @Test
    public void ChoiceExceeded(){
        assert(Library.GetChoice()>5);
    }

    @Test
    public void ChoiceInvalid(){
        assert(Library.GetChoice()<0);
    }
}
