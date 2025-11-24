import java.util.*;

public class SortedQue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        queue.add(50);
        System.out.println("Original Queue: " + queue);
        List<Integer> list = new ArrayList<>(queue);
        Collections.sort(list);
        queue.clear();
        queue.addAll(list);

        System.out.println("Sorted Queue: " + queue);
    }
}
