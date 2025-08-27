package ControlFlows.Level1;

import java.util.Scanner;

public class Divisibe {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter the Number = ");
        int Number = sc.nextInt();
        if (Number % 5 == 0){
            System.out.println("Is the number "+Number+" divisible by 5 ? Yes");
        } else{
            System.out.println("Is the number "+Number+" divisible by 5? No");
        }
        sc.close();
    }

    
}
