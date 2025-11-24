package Encapsulation;
import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String n, double p) {
        this.id = id;
        this.name = n;
        this.price = p;
    }

    public double getPrice() { return price; }
    public void setPrice(double p) { price = p; }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String n, double p) {
        super(id, n, p);
    }

    double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return ""; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String n, double p) {
        super(id, n, p);
    }

    double calculateDiscount() { return getPrice() * 0.15; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return ""; }
}

class Groceries extends Product {
    public Groceries(int id, String n, double p) {
        super(id, n, p);
    }

    double calculateDiscount() { return getPrice() * 0.05; }
}

public class Program2 {
    public static void printFinal(List<Product> items) {
        for (Product p : items) {
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println(finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> list = List.of(
            new Electronics(1, "Laptop", 50000),
            new Clothing(2, "Shirt", 1000),
            new Groceries(3, "Rice", 500)
        );

        printFinal(list);
    }
}
