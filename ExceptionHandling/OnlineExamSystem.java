package ExceptionHandling;
import java.io.IOException;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String m) { super(m); }
}

class ExamService {
    public void validateStudent() throws InvalidStudentException {
        throw new InvalidStudentException("Student not registered!");
    }

    public void submitExam() throws IOException, InvalidStudentException {
        validateStudent();
        throw new IOException("File upload error!");
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        ExamService s = new ExamService();

        try {
            s.submitExam();
        } catch (InvalidStudentException e) {
            System.out.println("Student Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
