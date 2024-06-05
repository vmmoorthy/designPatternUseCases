package facade;

import facade.library.LibraryFacade;

public class Main {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();

        // Borrowing a book
        libraryFacade.borrowBook("Let us C");

        // Returning a book
        libraryFacade.returnBook("Design patten by GoF");

        // Searching for a book
        libraryFacade.searchBook("The 5 AM club");
    }
}
