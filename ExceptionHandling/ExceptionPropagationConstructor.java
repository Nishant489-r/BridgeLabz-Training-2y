package ExceptionHandling;
import java.io.*;

class FileHandler {
    public FileHandler(String fileName) throws IOException {
        if (!new File(fileName).exists())
            throw new IOException("File not found!");
    }
}

public class ExceptionPropagationConstructor {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("missing.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
