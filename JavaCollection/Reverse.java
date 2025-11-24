import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Reverse {
    public static <T> void reverseArrayList(List<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
            i++; j--;
        }
    }

    public static <T> void reverseLinkedList(LinkedList<T> list) {
       
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T tmp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, tmp);
            left++; right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3); arr.add(4); arr.add(5);
        System.out.println("Original ArrayList: " + arr);
        reverseArrayList(arr);
        System.out.println("Reversed ArrayList: " + arr);

       
        LinkedList<String> linked = new LinkedList<>();
        linked.add("A"); linked.add("B"); linked.add("C"); linked.add("D");
        System.out.println("Original LinkedList: " + linked);
        reverseLinkedList(linked);
        System.out.println("Reversed LinkedList: " + linked);
    }
}
