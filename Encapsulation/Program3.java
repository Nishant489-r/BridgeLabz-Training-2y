package Encapsulation;
import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String number;
    private double rate;

    public Vehicle(String number, double rate) {
        this.number = number;
        this.rate = rate;
    }

    public double getRate() { return rate; }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String no, double rate) {
        super(no, rate);
    }

    double calculateRentalCost(int days) { return getRate() * days; }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return ""; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String no, double rate) {
        super(no, rate);
    }

    double calculateRentalCost(int days) { return getRate() * days; }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return ""; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String no, double rate) {
        super(no, rate);
    }

    double calculateRentalCost(int days) { return getRate() * days + 500; }
    public double calculateInsurance() { return 3000; }
    public String getInsuranceDetails() { return ""; }
}

public class Program3 {
    public static void main(String[] args) {
        List<Vehicle> list = List.of(
            new Car("C1", 1000),
            new Bike("B1", 300),
            new Truck("T1", 2000)
        );

        for (Vehicle v : list)
            System.out.println(v.calculateRentalCost(5));
    }
}
