import java.util.Scanner;
public class ParaOfRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = ");
        int length = sc.nextInt();

        System.out.print("Enter the width = ");
        int width = sc.nextInt();
        int parameter = 2*(length + width);

        System.out.println("Parameter of a rectangle is = "+parameter);
        sc.close();

    }
    
}
