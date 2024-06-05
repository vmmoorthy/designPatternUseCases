package facade.library;

public class LibraryFacade {
    private BorrowBook borrowBook;
    private ReturnBook returnBook;
    private SearchBook searchBook;

    public LibraryFacade() {
        borrowBook = new BorrowBook();
        returnBook = new ReturnBook();
        searchBook = new SearchBook();
    }

    public void borrowBook(String bookTitle) {
        borrowBook.borrow(bookTitle);
    }

    public void returnBook(String bookTitle) {
        returnBook.returnBook(bookTitle);
    }

    public void searchBook(String bookTitle) {
        searchBook.search(bookTitle);
    }
}