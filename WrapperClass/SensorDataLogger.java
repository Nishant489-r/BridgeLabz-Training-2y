package WrapperClass;
import java.util.*;

public class SensorDataLogger {
    static void logData(Double d) { System.out.println("Logged: " + d); }
    static void logData(double d) { System.out.println("Logged: " + d); }

    public static void main(String[] args) {
        List<Double> storage = new ArrayList<>();

        double temp1 = 36.5;  
        Double temp2 = 37.8;   

        storage.add(temp1);   
        storage.add(temp2);

        for (Double t : storage)   
            System.out.println("Stored: " + t);

        logData(temp1);
        logData(temp2);
    }
}
