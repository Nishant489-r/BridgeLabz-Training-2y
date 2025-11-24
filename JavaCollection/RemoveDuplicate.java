import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
public class RemoveDuplicate {
    public static <T> List<T> removeDuplicates(List<T> list) {
        HashSet<T> seen = new HashSet<>();
        ArrayList<T> result = new ArrayList<>();
        for (T item : list) {
            if (!seen.contains(item)) {
                seen.add(item);
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Original: " + input);
        List<Integer> out = removeDuplicates(input);
        System.out.println("After removing duplicates (order preserved): " + out);
    }
}
