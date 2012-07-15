import org.junit.Test;

public class BooksMainTest {
    @Test
    public void ChoiceExceeded(){
        assert(BooksMain.GetChoice()>5);
    }

    @Test
    public void ChoiceInvalid(){
        assert(BooksMain.GetChoice()<0);
    }
}
