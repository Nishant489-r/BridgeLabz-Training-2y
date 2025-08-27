package ControlFlows.Level1;

import java.util.Scanner;

public class LargestNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three numbers = ");
        int fn = sc.nextInt();
        int sn = sc.nextInt();
        int tn = sc.nextInt();
        boolean firstL = (fn < sn && fn<tn);
        System.out.println("Is the first number the largest ?"+(firstL ? "Yes":"No"));
        boolean secondL = (sn < fn && sn<tn);
        System.out.println("Is the Second number the largest ?"+(secondL? "Yes":"No"));
        boolean thirdL = (tn < sn && tn<fn);
        System.out.println("Is the third number the largest ?"+(thirdL? "Yes":"No"));
        


    }
    
}
