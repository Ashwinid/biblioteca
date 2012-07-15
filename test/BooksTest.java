import org.junit.Test;
public class BooksTest {


    @Test
    public void BookNameNotNull0(){
    assert(Books.GetName(0)!= null);
        }

    @Test
    public void BookNameNotNull1(){
        assert(Books.GetName(1)!= null);
    }

    @Test
    public void BookNameNotNull2(){
        assert(Books.GetName(2)!= null);
    }

    @Test
    public void BookNameNotNull3(){
        assert(Books.GetName(3)!= null);
    }

    @Test
    public void BookNameNotNull4(){
        assert(Books.GetName(4)!= null);
    }

    @Test
    public void AuthorNameNotNull0(){
        assert(Books.GetAuthorName(0)!= null);
    }

    @Test
    public void AuthorNameNotNull1(){
        assert(Books.GetAuthorName(1)!= null);
    }

    @Test
    public void AuthorNameNotNull2(){
        assert(Books.GetAuthorName(2)!= null);
    }

    @Test
    public void AuthorNameNotNull3(){
        assert(Books.GetAuthorName(3)!= null);
    }
    @Test
    public void AuthorNameNotNull4(){
        assert(Books.GetAuthorName(4)!= null);
    }


    @Test
    public void NoOfCopiesMinLimit0(){
        assert(Books.GetNumberOfCopies(0)>0);

    }
    @Test
    public void NoOfCopiesMinLimit1(){
         assert(Books.GetNumberOfCopies(0)>0);

     }

    @Test
    public void NoOfCopiesMinLimit2(){
        assert(Books.GetNumberOfCopies(0)>0);

    }

    @Test
    public void NoOfCopiesMinLimit3(){
        assert(Books.GetNumberOfCopies(0)>0);

    }

    @Test
    public void NoOfCopiesMinLimit4(){
        assert(Books.GetNumberOfCopies(0)>0);

    }


    }


