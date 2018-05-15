import java.util.HashMap;

public class BookHash {
    public class Book {
        public static void main(String[] args) {
            BookHash<String, String> book = new HashMap();

            BookHash.put("Romance", "The Notebook");
            BookHash.put("Thriller", "Gone Girl");
            BookHash.put("Sci-fi", "Game of Thrones");

            System.out.println(BookHash.get("Romance"));

        }
}

    private static void put(String genre, String title) {
    }
