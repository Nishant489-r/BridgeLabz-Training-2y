import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity; 

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    public int compareTo(Patient other) {
        return other.severity - this.severity;
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {

        PriorityQueue<Patient> triageQueue = new PriorityQueue<>();
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));
        triageQueue.add(new Patient("David", 4));

        System.out.println("=== Patients will be treated in this order ===");

        while (!triageQueue.isEmpty()) {
            System.out.println("Treating: " + triageQueue.poll());
        }
    }
}
