package Encapsulation;
import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLoc);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String id, String name, double rate, String loc) {
        this.vehicleId = id;
        this.driverName = name;
        this.ratePerKm = rate;
        this.currentLocation = loc;
    }

    public double getRate() { return ratePerKm; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String name) { driverName = name; }

    public void getVehicleDetails() {
        System.out.println(vehicleId + " " + driverName + " " + currentLocation);
    }

    public String getCurrentLocation() { return currentLocation; }
    public void updateLocation(String newLoc) { currentLocation = newLoc; }

    abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    public Car(String id, String driver, double rate, String loc) {
        super(id, driver, rate, loc);
    }

    double calculateFare(double distance) {
        return distance * getRate();
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String id, String driver, double rate, String loc) {
        super(id, driver, rate, loc);
    }

    double calculateFare(double distance) {
        return distance * getRate() * 0.8;
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String id, String driver, double rate, String loc) {
        super(id, driver, rate, loc);
    }

    double calculateFare(double distance) {
        return distance * getRate() * 0.9;
    }
}

public class Program8 {
    public static void calculateRideCost(List<Vehicle> vehicles, double distance) {
        for (Vehicle v : vehicles)
            System.out.println(v.calculateFare(distance));
    }

    public static void main(String[] args) {
        List<Vehicle> rides = List.of(
            new Car("C1", "Ramesh", 15, "City A"),
            new Bike("B1", "Suresh", 10, "City B"),
            new Auto("A1", "Mahesh", 12, "City C")
        );

        calculateRideCost(rides, 10);
    }
}
