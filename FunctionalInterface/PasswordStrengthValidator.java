package FunctionalInterface;
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[@#$%^&+=].*");
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String pass = "Strong@123";
        System.out.println(SecurityUtils.isStrongPassword(pass));
    }
}
