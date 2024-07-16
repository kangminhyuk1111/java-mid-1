package nested.nested.test.ex2;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        this.books = new Book[size];
        this.bookCount = 0;
    }

    public void addBook(String bookName, String bookAuthor) {
        if (bookCount >= books.length) {
            System.out.println("저장 공간이 부족합니다.");
            return;
        }

        books[bookCount++] = new Book(bookName, bookAuthor);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].bookName + ", 저자: " + books[i].bookAuthor);
        }
    }

    private static class Book {
        private final String bookName;
        private final String bookAuthor;

        public Book(final String bookName, final String bookAuthor) {
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
        }
    }
}
