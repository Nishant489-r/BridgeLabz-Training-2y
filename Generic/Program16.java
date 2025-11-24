package Generic;
import java.util.*;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
}

public class Program16 {
    public static void processAll(List<? extends JobRole> roles) {
        for (JobRole r : roles)
            System.out.println(r.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        List<JobRole> list = List.of(new SoftwareEngineer(), new DataScientist());
        processAll(list);
    }
}
