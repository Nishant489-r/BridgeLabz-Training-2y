package WrapperClass;
import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "null", "88", "xyz"};

        ArrayList<Integer> marks = new ArrayList<>();

        for (String s : inputs) {
            try {
                if (s.equals("null")) continue;
                marks.add(Integer.parseInt(s));
            } catch (Exception e) {}
        }

        int sum = 0;
        for (int m : marks) sum += m;

        double avg = marks.isEmpty() ? 0 : (double) sum / marks.size();

        System.out.println("Average marks: " + avg);
    }
}
