package WrapperClass;
import java.util.*;

public class CharacterWrapperUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int letters = 0, digits = 0, special = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch))
                letters++;
            else if (Character.isDigit(ch))
                digits++;
            else if (!Character.isWhitespace(ch))
                special++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}
