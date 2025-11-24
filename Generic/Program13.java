package Generic;
interface Category {}

class BookCategory implements Category {}
class ClothingCategory implements Category {}

class Product<T extends Category> {
    double price;
    Product(double price) { this.price = price; }
    double getPrice() { return price; }
}

public class Program13 {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        double newPrice = product.getPrice() - (product.getPrice() * percent / 100);
        System.out.println(newPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>(500);
        applyDiscount(book, 10);
    }
}
