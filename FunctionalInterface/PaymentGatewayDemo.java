package FunctionalInterface;
interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Default refund: " + amount);
    }
}

class PayPal implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("PayPal paid: " + amount);
    }
}

class Stripe implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Stripe paid: " + amount);
    }

    // Optional override
    public void refund(double amount) {
        System.out.println("Stripe refund: " + amount);
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayPal();
        PaymentProcessor p2 = new Stripe();

        p1.pay(500);
        p1.refund(100);

        p2.pay(700);
        p2.refund(200);
    }
}
