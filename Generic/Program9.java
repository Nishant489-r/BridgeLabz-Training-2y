package Generic;
import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }

    public void displayItems() {
        for (T i : items) System.out.println(i);
    }
}

class Electronics {
    public String toString() { return "Laptop"; }
}

class Clothing {
    public String toString() { return "Shirt"; }
}

public class Program9 {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());
        eCart.displayItems();

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());
        cCart.displayItems();
    }
}
