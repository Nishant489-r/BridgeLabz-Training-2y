package Encapsulation;
import java.util.*;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int id;
    private String title;
    private String author;

    public LibraryItem(int id, String t, String a) {
        this.id = id;
        this.title = t;
        this.author = a;
    }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(id + " " + title);
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String t, String a) {
        super(id, t, a);
    }

    int getLoanDuration() { return 14; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int id, String t, String a) {
        super(id, t, a);
    }

    int getLoanDuration() { return 7; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int id, String t, String a) {
        super(id, t, a);
    }

    int getLoanDuration() { return 3; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}

public class Program5 {
    public static void main(String[] args) {
        List<LibraryItem> list = List.of(
            new Book(1, "Book A", "X"),
            new DVD(2, "DVD B", "Y")
        );

        for (LibraryItem i : list)
            System.out.println(i.getLoanDuration());
    }
}
