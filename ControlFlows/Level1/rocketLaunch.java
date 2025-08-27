package ControlFlows.Level1;
import java.util.Scanner;

public class rocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdowm number = ");
        int num = sc.nextInt();
        while (num>=1){
            System.err.println(num);
            num--;

        }
        System.err.println("Rocket launched");

    sc.close();
    }
    
}
