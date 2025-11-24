import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Frequency {
    public static Map<String, Integer> frequency(List<String> items) {
        Map<String, Integer> freq = new HashMap<>();
        for (String s : items) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println("Input: " + input);
        Map<String, Integer> result = frequency(input);
        System.out.println("Frequencies: " + result);
    }
}
