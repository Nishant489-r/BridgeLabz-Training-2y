package Generic;
import java.util.List;
public class NumberSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3);
        List<Double> dbls = List.of(2.5, 3.5);

        System.out.println(sumNumbers(ints));
        System.out.println(sumNumbers(dbls));
    }
}
