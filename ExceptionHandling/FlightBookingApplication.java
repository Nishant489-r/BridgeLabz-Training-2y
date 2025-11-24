package ExceptionHandling;
class SeatUnavailableException extends Exception { 
    public SeatUnavailableException(String m){ super(m); } 
}

class PaymentFailedException2 extends Exception { 
    public PaymentFailedException2(String m){ super(m); } 
}

class FlightBooking {

    public void checkSeatAvailability() throws SeatUnavailableException {
        throw new SeatUnavailableException("No seats available!");
    }

    public void processPayment() throws PaymentFailedException2 {
        throw new PaymentFailedException2("Payment failed!");
    }

    public void bookTicket() throws SeatUnavailableException, PaymentFailedException2 {
        checkSeatAvailability();
        processPayment();
    }
}

public class FlightBookingApplication {
    public static void main(String[] args) {
        FlightBooking f = new FlightBooking();

        try {
            f.bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException2 e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
