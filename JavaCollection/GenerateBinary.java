import java.util.*;

public class GenerateBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        List<String> result = generateBinaryNumbers(n);

        System.out.println("First " + n + " Binary Numbers:");
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    public static List<String> generateBinaryNumbers(int n) {
        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 0; i < n; i++) {
            String binary = queue.poll();
            list.add(binary);

            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }

        return list;
    }
}
