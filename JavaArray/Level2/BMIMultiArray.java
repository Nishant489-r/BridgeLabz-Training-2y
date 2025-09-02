package JavaArray.Level2;
import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            double weight;
            do {
                System.out.print("Weight (kg): ");
                weight = sc.nextDouble();
            } while (weight <= 0);
            double height;
            do {
                System.out.print("Height (m): ");
                height = sc.nextDouble();
            } while (height <= 0);
            double bmi = weight / (height * height);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println(" BMI Report ");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Weight: %.2f kg, Height: %.2f m, BMI: %.2f, Status: %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        sc.close();
    }
}
