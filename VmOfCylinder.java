import java.util.Scanner;
public class VmOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius = ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height = ");
        double height = sc.nextDouble();

        double Volume = 3.13*radius*radius*height;
        System.out.println("Volume of a cylinder is = "+Volume);
        sc.close();
        

    }
    
}
