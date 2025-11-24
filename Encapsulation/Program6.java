package Encapsulation;
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String name;
    private double price;
    private int qty;

    public FoodItem(String n, double p, int q) {
        name = n;
        price = p;
        qty = q;
    }

    public double getPrice() { return price; }
    public int getQty() { return qty; }

    abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(name);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String n, double p, int q) {
        super(n, p, q);
    }

    double calculateTotalPrice() { return getPrice() * getQty(); }
    public double applyDiscount() { return 10; }
    public String getDiscountDetails() { return ""; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String n, double p, int q) {
        super(n, p, q);
    }

    double calculateTotalPrice() { return getPrice() * getQty() + 20; }
    public double applyDiscount() { return 5; }
    public String getDiscountDetails() { return ""; }
}

public class Program6 {
    public static void main(String[] args) {
        FoodItem f = new NonVegItem("Chicken", 200, 2);
        System.out.println(f.calculateTotalPrice());
    }
}
