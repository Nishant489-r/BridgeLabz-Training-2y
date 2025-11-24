import java.util.HashSet;
import java.util.Set;

public class CheckTwoset {

    public static <T> boolean areSetsEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1); set1.add(2); set1.add(3);
        set2.add(3); set2.add(2); set2.add(1);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Are sets equal? -> " + areSetsEqual(set1, set2));
    }
}
