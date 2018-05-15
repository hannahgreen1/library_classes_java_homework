import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setup(){
        library = new Library(3);
        book = new Book();
    }

    @Test
    public void canAddBook(){
       library.addBook(book);
       assertEquals(1, library.bookCount());
    }

    @Test
    public void canGetBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void isLibraryFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.maxCapacity());
    }


}
