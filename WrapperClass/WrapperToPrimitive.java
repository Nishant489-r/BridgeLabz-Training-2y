package WrapperClass;
public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = 45.67;

        double d = dObj;
        int i = dObj.intValue();

        System.out.println("Double primitive: " + d);
        System.out.println("Int primitive: " + i);
    }
}
