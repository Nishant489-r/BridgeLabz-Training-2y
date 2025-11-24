package FunctionalInterface;
interface SensitiveData {}

class BankAccount implements SensitiveData {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class SensitiveDataDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(12345, 5000);

        if (acc instanceof SensitiveData)
            System.out.println("Encrypt before storing");
    }
}
