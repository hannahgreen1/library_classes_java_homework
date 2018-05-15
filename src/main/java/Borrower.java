import org.junit.Before;

import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> bookCollection;

    public Borrower(String name){
        this.name = name;
        this.bookCollection = new ArrayList<>();
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public void borrowBook(Book book) {
        this.bookCollection.add(book);
    }

    public void returnAllBook() {
        this.bookCollection.clear();
    }

    public void borrowBookFromLibrary (Library library){
        Book book = library.removeBook();
        borrowBook(book);
    }

}
