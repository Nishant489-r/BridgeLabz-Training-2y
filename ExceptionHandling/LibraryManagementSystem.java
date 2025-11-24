package ExceptionHandling;
import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String m) { super(m); }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String m) { super(m); }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String m) { super(m); }
}

class Library {
    Map<String, Boolean> books = new HashMap<>();
    Map<String, Integer> userBorrowCount = new HashMap<>();

    public Library() {
        books.put("Java", true);
        books.put("Python", true);
    }

    public void borrowBook(String user, String book) throws Exception {
        if (!books.getOrDefault(book, false))
            throw new BookNotAvailableException("Book already taken!");

        int count = userBorrowCount.getOrDefault(user, 0);
        if (count >= 5)
            throw new UserLimitExceededException("User limit exceeded!");

        books.put(book, false);
        userBorrowCount.put(user, count + 1);
        System.out.println("Book borrowed: " + book);
    }

    public void returnBook(String user, String book) throws Exception {
        if (books.getOrDefault(book, true))
            throw new InvalidReturnException("Book was not borrowed!");

        books.put(book, true);
        System.out.println("Book returned: " + book);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();

        try {
            lib.borrowBook("Amit", "Java");
            lib.borrowBook("Amit", "Java");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
