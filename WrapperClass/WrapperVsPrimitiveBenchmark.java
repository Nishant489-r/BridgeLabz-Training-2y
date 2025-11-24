package WrapperClass;
import java.util.*;

public class WrapperVsPrimitiveBenchmark {
    public static void main(String[] args) {
        int size = 1_000_000;

        long start1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) list.add(i);
        long sum1 = 0;
        for (int n : list) sum1 += n;
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;
        long sum2 = 0;
        for (int n : arr) sum2 += n;
        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList<Integer> time: " + (end1 - start1) + " ms");
        System.out.println("int[] time: " + (end2 - start2) + " ms");
    }
}
