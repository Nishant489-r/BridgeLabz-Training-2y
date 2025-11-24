package Generic;
import java.util.*;
abstract class Product {
    abstract double getPrice();
}
class Mobile extends Product {
    public double getPrice() { return 15000; }
}
class Laptop extends Product {
    public double getPrice() { return 60000; }
}
public class Program10 {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }
    public static void main(String[] args) {
        List<Product> list = List.of(new Mobile(), new Laptop());
        System.out.println(calculateTotal(list));
    }
}
