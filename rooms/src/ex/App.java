package ex;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws ReservationNoAvailableException {
        Room r = new Room();
        r.reserve("alfonso", LocalDate.of(2024, 02, 10),
                LocalDate.of(2024, 02, 20));
        r.reserve("alfonso", LocalDate.of(2024, 02, 05),
                LocalDate.of(2024, 02, 15));

        r.reserve("maria", LocalDate.of(2024, 02, 21),
                LocalDate.of(2024, 02, 28));

        for (Reservation res : r.reservations()) {
            System.out.println(res);
        }
    }
}
