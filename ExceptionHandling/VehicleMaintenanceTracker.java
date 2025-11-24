package ExceptionHandling;
class ServiceOverdueException extends Exception { ServiceOverdueException(String m){super(m);} }
class InvalidMileageException extends Exception { InvalidMileageException(String m){super(m);} }

class Vehicle {
    public void checkMaintenance(boolean overdue, int mileage) throws Exception {
        if (overdue) throw new ServiceOverdueException("Service overdue!");
        if (mileage < 0) throw new InvalidMileageException("Mileage cannot be negative!");
        System.out.println("Vehicle OK");
    }
}

public class VehicleMaintenanceTracker {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        try {
            v.checkMaintenance(true, 12000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
