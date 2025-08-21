package ProgrammingElements.Level1;

import java.util.Scanner;

public class FeetAndInches {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height in cm = ");
        int height = sc.nextInt();
        double totalInches = height/ 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) (totalInches % 12);
        System.out.println("The height in cm is "+height+" while in feet is "+feet+" and in inches is "+inches);
        sc.close();
    }
    
}
