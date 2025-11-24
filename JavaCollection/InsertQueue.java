import java.util.*;

public class InsertQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

       
        queue.offer("A"); 
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        System.out.println("Queue after systematic insertion: " + queue);
        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Total elements: " + queue.size());
    }
}
