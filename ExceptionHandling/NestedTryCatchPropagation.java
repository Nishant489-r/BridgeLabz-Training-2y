package ExceptionHandling;
public class NestedTryCatchPropagation {
    public static void methodB() {
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException in methodB");
        }
        String s = null;
        s.length();
    }

    public static void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Caught in methodA: " + e);
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}
