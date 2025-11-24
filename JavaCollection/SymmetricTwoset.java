import java.util.HashSet;
import java.util.Set;

public class SymmetricTwoset {

    public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        for (T x : b) {
            if (!result.add(x)) {
                result.remove(x);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        s1.add(1); s1.add(2); s1.add(3);
        s2.add(3); s2.add(4); s2.add(5);
        System.out.println("Symmetric Difference: " + symmetricDifference(s1, s2));
    
    }
}
