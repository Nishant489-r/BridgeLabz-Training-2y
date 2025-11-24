import java.util.HashSet;
import java.util.Set;
public class UnionIntersection {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        s1.add(1); s1.add(2); s1.add(3);
        s2.add(3); s2.add(4); s2.add(5);

        System.out.println("Union: " + union(s1, s2));
        System.out.println("Intersection: " + intersection(s1, s2));
    }
}
