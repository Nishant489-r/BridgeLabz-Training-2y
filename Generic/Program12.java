package Generic;
import java.util.*;

abstract class WarehouseItem {}

class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void add(T item) { items.add(item); }
}

public class Program12 {
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items)
            System.out.println(i.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        List<WarehouseItem> list = List.of(new Electronics(), new Groceries());
        displayAll(list);
    }
}
