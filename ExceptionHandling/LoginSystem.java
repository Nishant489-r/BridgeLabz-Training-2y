package ExceptionHandling;
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) { super(msg); }
}

public class LoginSystem {
    public static void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals("admin") || !pass.equals("1234"))
            throw new InvalidCredentialsException("Incorrect username or password!");
    }

    public static void main(String[] args) {
        try {
            validate("admin", "0000");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
