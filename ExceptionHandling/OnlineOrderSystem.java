package ExceptionHandling;
import java.util.Random;

class OutOfStockException extends Exception { OutOfStockException(String m){super(m);} }
class PaymentFailedException extends Exception { PaymentFailedException(String m){super(m);} }

class Order {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        int r = new Random().nextInt(3);
        if (r == 0) throw new OutOfStockException("Product is out of stock!");
        if (r == 1) throw new PaymentFailedException("Payment failed!");
        System.out.println("Order placed successfully!");
    }
}

public class OnlineOrderSystem {
    public static void main(String[] args) {
        Order o = new Order();
        try {
            o.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

