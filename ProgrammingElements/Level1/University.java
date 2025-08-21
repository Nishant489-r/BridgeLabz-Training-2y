package ProgrammingElements.Level1;


public class University {
    public static void main(String[] args) {
        int fee = 125000;
        int dissPer = 10;
        double discount = (fee*dissPer)/100;
        double discounted = fee - discount;
        System.err.println("The discount amount INR "+discount+" and the final discounted fee is INR "+discounted);
        
    }
    
}
