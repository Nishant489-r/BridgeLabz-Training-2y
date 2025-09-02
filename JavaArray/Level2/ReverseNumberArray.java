package JavaArray.Level2;
import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0, temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        int i = 0;
        while (number != 0) {
            digits[i++] = number % 10;
            number /= 10;
        }
        System.out.print("Reversed number = ");
        for (int j = 0; j < digits.length; j++) {
            System.out.print(digits[j]);
        }
        sc.close();
    }
}

