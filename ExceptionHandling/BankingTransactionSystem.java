package ExceptionHandling;
import java.util.Random;

class NegativeAmountException extends Exception { NegativeAmountException(String m){super(m);} }
class NetworkFailureException extends Exception { NetworkFailureException(String m){super(m);} }

class Transaction {
    public void process(double amount, double balance) throws Exception {
        int r = new Random().nextInt(3);
        if (amount < 0) throw new NegativeAmountException("Amount cannot be negative!");
        if (amount > balance) throw new InsufficientFundsException("Not enough balance!");
        if (r == 1) throw new NetworkFailureException("Network error!");
        System.out.println("Transaction successful!");
    }
}

public class BankingTransactionSystem {
    public static void main(String[] args) throws Exception {
        Transaction t = new Transaction();
        try {
            t.process(5000, 2000);
        } catch (NegativeAmountException | InsufficientFundsException | NetworkFailureException e) {
            System.out.println("Failure: " + e.getMessage());
        }
    }
}
