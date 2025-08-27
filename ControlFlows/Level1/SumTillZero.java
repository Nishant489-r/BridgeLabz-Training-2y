package ControlFlows.Level1;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        while (number != 0) {
            total += number;
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
        }
        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
    