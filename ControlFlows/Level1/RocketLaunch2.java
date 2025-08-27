package ControlFlows.Level1;

import java.util.Scanner;

public class RocketLaunch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdowm number = ");
        int num = sc.nextInt();
        for (int i = num ; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Rocket Launched");
        sc.close();
    }
    
}
