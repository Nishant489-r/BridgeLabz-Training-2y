package ExceptionHandling;
class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String m) { super(m); }
}

public class TemperatureConversionTool {
    public static double convert(double temp, char unit) throws InvalidTemperatureException {
        if (unit == 'C' && temp < -273.15)
            throw new InvalidTemperatureException("Below absolute zero!");
        if (unit == 'F' && temp < -459.67)
            throw new InvalidTemperatureException("Below absolute zero!");

        if (unit == 'C') return (temp * 9/5) + 32;
        else return (temp - 32) * 5/9;
    }

    public static void main(String[] args) {
        try {
            System.out.println(convert(-300, 'C'));
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
