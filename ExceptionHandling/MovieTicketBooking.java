package ExceptionHandling;
import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String m) { super(m); }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String m) { super(m); }
}

class Theatre {
    Map<Integer, Boolean> seats = new HashMap<>();

    public Theatre() {
        for (int i = 1; i <= 10; i++) seats.put(i, true);
    }

    public void bookSeat(int seatNo) throws Exception {
        if (!seats.containsKey(seatNo))
            throw new InvalidSeatException("Seat does not exist!");

        if (!seats.get(seatNo))
            throw new SeatAlreadyBookedException("Seat already booked!");

        seats.put(seatNo, false);
        System.out.println("Seat booked: " + seatNo);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Theatre t = new Theatre();
        try {
            t.bookSeat(5);
            t.bookSeat(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
