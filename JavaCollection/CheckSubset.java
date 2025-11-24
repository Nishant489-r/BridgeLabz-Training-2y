import java.util.HashSet;
import java.util.Set;

public class CheckSubset {

    public static <T> boolean isSubset(Set<T> a, Set<T> b) {
        return b.containsAll(a);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(2); set1.add(3);
        set2.add(1); set2.add(2); set2.add(3); set2.add(4);

        System.out.println("Is Set1 subset of Set2? -> " + isSubset(set1, set2));
    }
}
