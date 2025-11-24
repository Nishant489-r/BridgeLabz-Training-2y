import java.util.*;

public class RemoveQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println("Original Queue: " + queue);
        while (!queue.isEmpty()) {
            int removed = queue.poll(); 
            System.out.println("Removed: " + removed);
            System.out.println("Queue now: " + queue);
        }
        System.out.println("All elements removed. Final Queue: " + queue);
    }
}
