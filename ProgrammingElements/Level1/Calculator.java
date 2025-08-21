package ProgrammingElements.Level1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        double first = sc.nextDouble();
        System.out.print("Enter the second number = ");
        double second = sc.nextDouble();
        double add = first + second;
        double sub = first - second;
        double multi = first * second;
        double div = first/second;
        System.err.println("The addition, subtraction, multiplication and division value of 2 numbers is " +add +","+sub+"," +multi+"," +div);
        sc.close();
    }
    
}
