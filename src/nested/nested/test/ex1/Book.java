package nested.nested.test.ex1;

public class Book {

    private final String bookName;
    private final String bookAuthor;

    public Book(final String bookName, final String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}

