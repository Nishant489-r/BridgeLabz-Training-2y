import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {
    public static <T> List<T> rotateLeft(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return list;
        k = ((k % n) + n) % n; 
        List<T> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(list.get((i + k) % n));
        }
        return result;
    }
    public static <T> void rotateLeftInPlace(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return;
        k = ((k % n) + n) % n;
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }

    private static <T> void reverse(List<T> list, int i, int j) {
        while (i < j) {
            T tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
            i++; j--;
        }
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> arr = new ArrayList<>(input);
        System.out.println("Original: " + arr);

        List<Integer> rotated = rotateLeft(arr, 2);
        System.out.println("Rotated (left by 2): " + rotated);
        List<Integer> inPlace = new ArrayList<>(input);
        rotateLeftInPlace(inPlace, 2);
        System.out.println("Rotated in-place (left by 2): " + inPlace);
    }
}
