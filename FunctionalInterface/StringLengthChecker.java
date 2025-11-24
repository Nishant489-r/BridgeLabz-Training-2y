package FunctionalInterface;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = msg -> msg.length();

        String message = "Hello Functional Interfaces!";
        int len = lengthChecker.apply(message);

        System.out.println("Length: " + len);
    }
}
