package ProgrammingElements.Level1;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height in inches
        System.out.print("Enter base of triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = sc.nextDouble();

        // Area in square inches
        double areaInInches = 0.5 * base * height;

        // Convert to square centimeters
        double areaInCm = areaInInches * 2.54 * 2.54;

        // Output in one line
        System.out.println("The area of the triangle with base " + base + " inches and height " + height + " inches is " 
                           + areaInInches + " square inches and " + areaInCm + " square centimeters.");
    }
}
