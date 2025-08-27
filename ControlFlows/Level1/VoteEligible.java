package ControlFlows.Level1;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the age = ");
        int Age = sc.nextInt();
        if (Age>=18){
            System.out.println("The person age is "+Age+" and can vote");
        
        }else{
            System.out.println("The person age is "+Age+" and cannot vote");

        }
        sc.close();


    }
    
}
