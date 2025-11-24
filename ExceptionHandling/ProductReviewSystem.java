package ExceptionHandling;
class InvalidRatingException extends Exception { 
    InvalidRatingException(String m){ super(m); } 
}

class EmptyReviewException extends Exception { 
    EmptyReviewException(String m){ super(m); } 
}

class Review {
    public void submitReview(int rating, String comment) 
            throws InvalidRatingException, EmptyReviewException {

        if (rating < 1 || rating > 5)
            throw new InvalidRatingException("Rating must be between 1 and 5!");

        if (comment == null || comment.isEmpty())
            throw new EmptyReviewException("Review comment is required!");

        System.out.println("Review Submitted!");
    }
}

public class ProductReviewSystem {
    public static void main(String[] args) {
        Review r = new Review();
        try {
            r.submitReview(6, "");
        } catch (InvalidRatingException e) {
            System.out.println("Rating error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Review error: " + e.getMessage());
        }
    }
}
