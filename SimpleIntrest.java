import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal = ");
        double principle = sc.nextDouble();

        System.out.print("Enter the Rate = ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time = ");
        double time = sc.nextDouble();

        double SimpleIntrest = (principle*rate*time)/100;
        System.err.println("Simple Intrest = "+SimpleIntrest);
        sc.close();

    }
    
}
