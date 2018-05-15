import java.util.ArrayList;

public class Library {
    private ArrayList<Book> book;
    private int capacity;

    public Library(int capacity){
        this.book = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book book){
        this.book.add(book);
    }

    public int bookCount() {
        return this.book.size();
    }

    public Book removeBook() {
        return this.book.remove(0);
    }


    public boolean maxCapacity() {
        return this.bookCount() == capacity;
    }
}
