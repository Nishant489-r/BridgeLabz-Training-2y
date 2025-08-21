package ProgrammingElements.Level1;

import java.util.Scanner;

public class University2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student fee = ");
        int stufees = sc.nextInt();
        System.out.print("Enter the University Discount = ");
        int discount = sc.nextInt();
        double Discounted = (stufees*discount)/100;
        double disprice = stufees - Discounted;
        System.out.println("The discounted amount is INR "+Discounted+"and the final discounted price is INR "+disprice);
        sc.close();
    }
}
