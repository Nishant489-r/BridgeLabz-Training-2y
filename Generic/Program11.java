package Generic;
import java.util.*;

abstract class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) { fleet.add(vehicle); }

    public void showFleet() {
        for (T v : fleet) System.out.println(v.getClass().getSimpleName());
    }
}

public class Program11 {
    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck());
        trucks.showFleet();

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike());
        bikes.showFleet();
    }
}
