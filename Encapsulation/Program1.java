package Encapsulation;
import java.util.*;

interface Department {
    void assignDepartment(String d);
    String getDepartmentDetails();
}
abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;
    public Employee(int id, String name, double s) {
        this.id = id;
        this.name = name;
        this.baseSalary = s;
    }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double s) { baseSalary = s; }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println(id + " " + name + " " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee implements Department {
    private String dept;
    public FullTimeEmployee(int id, String name, double s) {
        super(id, name, s);
    }
    public double calculateSalary() {
        return getBaseSalary();
    }
    public void assignDepartment(String d) { dept = d; }
    public String getDepartmentDetails() { return dept; }
}
class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private String dept;
    public PartTimeEmployee(int id, String name, double rate, int h) {
        super(id, name, rate);
        hours = h;
    }
    public double calculateSalary() {
        return getBaseSalary() * hours;
    }
    public void assignDepartment(String d) { dept = d; }
    public String getDepartmentDetails() { return dept; }
}
public class Program1 {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new FullTimeEmployee(1, "A", 40000),
            new PartTimeEmployee(2, "B", 200, 30)
        );
        for (Employee e : list)
            e.displayDetails();
    }
}
