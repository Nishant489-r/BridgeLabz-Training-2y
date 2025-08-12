import java.util.Scanner;
public class PowerCalc {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base = ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent = ");
        double exponent = sc.nextDouble();
        int calc = Math.pow(base,exponent);
        System.out.println("Result = "+calc);
        sc.close();

    }
    
}
