package ControlFlows.Level1;

import java.util.Scanner;

public class Smallest {
    public static void main (String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the three numbers = ");
        int fn = sc.nextInt();
        int sn = sc.nextInt();
        int tn = sc.nextInt();
        boolean isSmallest = (fn < sn && fn<tn);
        System.out.println("Is the first number the smallest ? "+(isSmallest? "Yes":"no"));

        
    }
    
}
