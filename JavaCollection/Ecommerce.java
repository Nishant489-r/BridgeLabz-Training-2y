import java.util.*;

// ---------------- DRIVER CLASS ----------------
class Ecommerce {
    int id;
    String name;
    boolean available;

    Ecommerce(int id, String name) {
        this.id = id;
        this.name = name;
        this.available = true;
    }

    public String toString() {
        return id + ". " + name + " (Available: " + available + ")";
    }
}

class Rider {
    int id;
    String name;

    Rider(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


class Ride {
    Rider rider;
    Driver driver;
    double distance;
    double fare;

    Ride(Rider rider, Driver driver, double distance) {
        this.rider = rider;
        this.driver = driver;
        this.distance = distance;
        this.fare = distance * 12;   
    }

    public void endRide() {
        driver.available = true;
        System.out.println("Ride ended successfully!");
        System.out.println("Total Fare: ₹" + fare);
    }
}
public class RideSharingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(1, "Amit"));
        drivers.add(new Driver(2, "Rohit"));
        drivers.add(new Driver(3, "Suresh"));

    
        Rider rider = new Rider(1, "Aparbal");

        Ride currentRide = null;

        while (true) {
            System.out.println("\n===== Ride Sharing Menu =====");
            System.out.println("1. Show Available Drivers");
            System.out.println("2. Book a Ride");
            System.out.println("3. End Ride");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("\n--- Available Drivers ---");
                    for (Driver d : drivers) {
                        if (d.available)
                            System.out.println(d);
                    }
                    break;

                case 2:
                    System.out.print("Enter distance (km): ");
                    double dist = sc.nextDouble();

            
                    Driver assigned = null;
                    for (Driver d : drivers) {
                        if (d.available) {
                            assigned = d;
                            d.available = false;
                            break;
                        }
                    }

                    if (assigned == null) {
                        System.out.println("No drivers available!");
                    } else {
                        currentRide = new Ride(rider, assigned, dist);
                        System.out.println("Ride booked!");
                        System.out.println("Driver assigned: " + assigned.name);
                        System.out.println("Estimated Fare: ₹" + currentRide.fare);
                    }
                    break;

                case 3:
                    if (currentRide == null) {
                        System.out.println("No active ride found!");
                    } else {
                        currentRide.endRide();
                        currentRide = null;
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Ride Sharing!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
