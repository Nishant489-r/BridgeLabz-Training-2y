import java.util.*;

// Patient class
class Patient {
    private String id;
    private String name;
    private int age;
    private String ailment;
    private int severity; // 1 (low) to 5 (critical) - informational only

    public Patient(String id, String name, int age, String ailment, int severity) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.severity = severity;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAilment() { return ailment; }
    public int getSeverity() { return severity; }

    @Override
    public String toString() {
        return String.format("ID:%s | Name:%s | Age:%d | Ailment:%s | Severity:%d",
                id, name, age, ailment, severity);
    }
}

public class HospitalManagementSystem {
    // unique admitted patient IDs
    private Set<String> admittedSet = new HashSet<>();

    // waiting queue (FIFO)
    private Queue<Patient> waitingQueue = new LinkedList<>();

    // stack of recently discharged patients for quick re-admit
    private Stack<Patient> dischargedStack = new Stack<>();

    // history of all treated patients
    private List<Patient> treatedHistory = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    // Admit patient (adds to set, queue, and list of all applicants)
    public void admitPatient() {
        System.out.print("Enter Patient ID: ");
        String id = sc.next().trim();
        sc.nextLine(); // consume newline
        if (admittedSet.contains(id)) {
            System.out.println("Patient with ID " + id + " is already admitted (or in system).");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter Age: ");
        int age = readInt();
        System.out.print("Enter Ailment/Reason: ");
        String ailment = sc.nextLine().trim();
        System.out.print("Enter Severity (1-5, 5=critical): ");
        int severity = readIntInRange(1,5);

        Patient p = new Patient(id, name, age, ailment, severity);
        admittedSet.add(id);
        waitingQueue.add(p);

        System.out.println("Patient admitted and queued for treatment: " + p);
    }

    // Show waiting queue
    public void showWaitingQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Waiting queue is empty.");
            return;
        }
        System.out.println("\n--- Waiting Queue (FIFO) ---");
        int pos = 1;
        for (Patient p : waitingQueue) {
            System.out.println(pos++ + ". " + p);
        }
    }

    // Treat next patient (poll queue)
    public void treatNextPatient() {
        if (waitingQueue.isEmpty()) {
            System.out.println("No patients in queue to treat.");
            return;
        }
        Patient p = waitingQueue.poll();
        System.out.println("Treating patient: " + p);

        // simulate treatment
        System.out.print("Enter treatment notes (short): ");
        sc.nextLine(); // consume leftover newline
        String notes = sc.nextLine(); // not stored, but could be extended

        // after treatment, push to discharged stack and add to history
        dischargedStack.push(p);
        treatedHistory.add(p);

        // Note: we keep patient's id in admittedSet to indicate they were in system.
        System.out.println("Patient treated and moved to discharged stack. Notes: " + notes);
    }

    // Re-admit the most recently discharged patient (pop from stack and enqueue again)
    public void readmitRecentPatient() {
        if (dischargedStack.isEmpty()) {
            System.out.println("No recently discharged patient to re-admit.");
            return;
        }
        Patient p = dischargedStack.pop();
        System.out.println("Re-admitting patient: " + p);
        waitingQueue.add(p);
        System.out.println("Patient re-added to waiting queue.");
    }

    // View recently discharged stack top (peek)
    public void viewRecentDischarged() {
        if (dischargedStack.isEmpty()) {
            System.out.println("No recently discharged patients.");
            return;
        }
        System.out.println("Most recently discharged: " + dischargedStack.peek());
    }

    // View treated history list
    public void viewTreatedHistory() {
        if (treatedHistory.isEmpty()) {
            System.out.println("No patients have been treated yet.");
            return;
        }
        System.out.println("\n--- Treated History ---");
        int idx = 1;
        for (Patient p : treatedHistory) {
            System.out.println(idx++ + ". " + p);
        }
    }

    // Remove patient from system completely (for example: final discharge + record removal)
    public void removePatientFromSystem() {
        System.out.print("Enter Patient ID to remove from system: ");
        String id = sc.next().trim();
        if (!admittedSet.contains(id)) {
            System.out.println("No such patient in system.");
            return;
        }

        // remove from waiting queue if present
        waitingQueue.removeIf(p -> p.getId().equals(id));

        // remove from discharged stack if present
        Stack<Patient> temp = new Stack<>();
        while (!dischargedStack.isEmpty()) {
            Patient p = dischargedStack.pop();
            if (!p.getId().equals(id)) temp.push(p);
        }
        while (!temp.isEmpty()) dischargedStack.push(temp.pop());

        // remove from treatedHistory
        treatedHistory.removeIf(p -> p.getId().equals(id));

        // finally remove from admittedSet
        admittedSet.remove(id);

        System.out.println("Patient with ID " + id + " removed from system.");
    }

    // Helper to read an int safely
    private int readInt() {
        while (true) {
            try {
                int v = sc.nextInt();
                return v;
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.print("Invalid number. Enter again: ");
            }
        }
    }

    