package WrapperClass;
import java.util.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3, 2};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4, 3));

        ArrayList<Integer> combined = new ArrayList<>();

        for (int r : oldRatings) combined.add(r);
        combined.addAll(newRatings);

        int sum = 0, count = 0;

        for (Integer r : combined) {
            if (r != null) {
                sum += r;
                count++;
            }
        }

        double avg = (count == 0) ? 0 : (double) sum / count;

        System.out.println("Average rating: " + avg);
    }
}
