package nested.nested.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books;

    public Library(int size) {
        this.books = new ArrayList<>(size);
    }

    public void addBook(String bookName, String bookAuthor) {
        final Book book = new Book(bookName, bookAuthor);
        books.add(book);
    }

    public void showBooks() {
        for (Object book : books) {
            System.out.println("book = " + book);
        }
    }
}
