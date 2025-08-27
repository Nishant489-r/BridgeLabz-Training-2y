package ControlFlows.Level1;
import java.util.Scanner;

public class PosiNegZero{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }else if (num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    sc.close();
    
    }

}