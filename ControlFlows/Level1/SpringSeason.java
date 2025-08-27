package ControlFlows.Level1;
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month = ");
        int month = sc.nextInt();
        System.out.print("Enter the day = ");
        int day = sc.nextInt();
        boolean isSpring = false;
        if ((month == 3 && day >=20 && day<=31)|| (month == 4 && day >=1 && day<=30)||(month == 5 && day >=1 && day<=30)||(month == 6 && day >=1 && day<=20)){
        isSpring = true;
        }
        if (isSpring){
            System.err.println("Its a spring season");

        }else{
            System.out.println("Its not a spring season");
        }
    
    sc.close();
        
    }
    
}
