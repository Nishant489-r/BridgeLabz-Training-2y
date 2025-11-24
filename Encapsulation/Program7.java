package Encapsulation;
import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> records = new ArrayList<>();

    public Patient(int id, String name, int age, String diagnosis) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public void addRecord(String r) { records.add(r); }
    public List<String> viewRecords() { return records; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String d) { diagnosis = d; }

    public void getPatientDetails() {
        System.out.println(patientId + " " + name + " " + age);
    }

    abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;

    public InPatient(int id, String name, int age, String diagnosis, int days, double charge) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = days;
        this.roomChargePerDay = charge;
    }

    double calculateBill() {
        return daysAdmitted * roomChargePerDay;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int id, String name, int age, String diagnosis, double fee) {
        super(id, name, age, diagnosis);
        this.consultationFee = fee;
    }

    double calculateBill() {
        return consultationFee;
    }
}

public class Program7 {
    public static void main(String[] args) {
        List<Patient> patients = List.of(
            new InPatient(1, "Ram", 40, "Infection", 5, 1500),
            new OutPatient(2, "Sita", 30, "Checkup", 500)
        );

        for (Patient p : patients)
            System.out.println(p.calculateBill());
    }
}
