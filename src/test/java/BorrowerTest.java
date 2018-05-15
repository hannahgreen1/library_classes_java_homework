import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setup(){
        borrower = new Borrower("Hannah");
        book = new Book();
        library = new Library(3);
        library.addBook(book);
    }

    @Test
    public void bookCollectionStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());
      assertEquals (0, library.bookCount());
    }
    @Test
    public void returnAllBooks(){
        borrower.borrowBook(book);
        borrower.returnAllBook();
        assertEquals(1,library.bookCount());
    }
}
