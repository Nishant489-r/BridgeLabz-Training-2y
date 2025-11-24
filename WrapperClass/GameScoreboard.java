package WrapperClass;
public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 25, null, 15};

        int nullCount = 0, total = 0;

        for (Integer s : scores) {
            if (s == null) nullCount++;
            else total += s;
        }

        System.out.println("Players not played: " + nullCount);
        System.out.println("Total valid score: " + total);
    }
}
