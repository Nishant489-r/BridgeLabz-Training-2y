package FunctionalInterface;
public class BackgroundJobExecutor {
    public static void main(String[] args) {
        Runnable job = () -> {
            for (int i = 1; i <= 3; i++)
                System.out.println("Running task " + i);
        };

        Thread t = new Thread(job);
        t.start();
    }
}
