import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Arrays;

public class NthFromLinked {
    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be >= 1");
        java.util.Iterator<T> fast = list.iterator();
        java.util.Iterator<T> slow = list.iterator();
        int moved = 0;
        while (moved < n) {
            if (!fast.hasNext()) {
                throw new NoSuchElementException("List size is smaller than n");
            }
            fast.next();
            moved++;
        }
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        if (slow.hasNext()) return slow.next();
        throw new NoSuchElementException("Unexpected error retrieving element");
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("List: " + list);

        int N = 2;
        String result = nthFromEnd(list, N);
        System.out.println("Element " + N + " from the end: " + result); 
        System.out.println("1st from end: " + nthFromEnd(list, 1)); 
        System.out.println("5th from end: " + nthFromEnd(list, 5)); 
    }
}
