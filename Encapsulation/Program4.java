package Encapsulation;
import java.util.*;

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private int number;
    private String name;
    private double balance;

    public BankAccount(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double a) { balance += a; }
    public void withdraw(double a) { balance -= a; }
    public double getBalance() { return balance; }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int number, String name, double balance) {
        super(number, name, balance);
    }

    double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan() {}
    public double calculateLoanEligibility() { return getBalance() * 2; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int number, String name, double balance) {
        super(number, name, balance);
    }

    double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan() {}
    public double calculateLoanEligibility() { return getBalance(); }
}

public class Program4 {
    public static void main(String[] args) {
        List<BankAccount> list = List.of(
            new SavingsAccount(1, "A", 50000),
            new CurrentAccount(2, "B", 30000)
        );

        for (BankAccount b : list)
            System.out.println(b.calculateInterest());
    }
}
