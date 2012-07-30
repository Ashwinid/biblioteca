package com.tw28;

import org.junit.Test;

public class LibraryControllerUITest {

    @Test
    public void ChoiceExceeded(){
        assert(new LibraryControllerUI().choice>0);
    }

    @Test
    public void ChoiceInvalid(){
        assert(new LibraryControllerUI().choice<0);
    }


}
