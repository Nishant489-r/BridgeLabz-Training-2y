package WrapperClass;
import java.util.*;

public class EmployeeAgeProcessor {
    public static void main(String[] args) {
        int[] ages = {25, 40, 30, 22, 50};
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages)
            list.add(age);

        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}
