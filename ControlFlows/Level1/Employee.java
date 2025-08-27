package ControlFlows.Level1;

import java.util.Scanner;

public class Employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("No bonus for employees with " + years + " years of service.");
        }
        sc.close();
    }
}
