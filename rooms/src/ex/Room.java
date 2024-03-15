package ex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Room {

    private List<Reservation> reservations = new ArrayList<>();

    public Reservation reserve(String name, LocalDate from, LocalDate to) {
        Reservation r = new Reservation(name, from, to);
        if (isReserved(from, to)) {
            throw new RuntimeException("room is reserved..");
        }
        reservations.add(r);
        return r;
    }

    public List<Reservation> reservations() {
        return new ArrayList<>(reservations);
    }

    private boolean isReserved(LocalDate from, LocalDate to) {
        for (Reservation r : reservations) {
            if (r.isReserved(from) || r.isReserved(to) ||
                    (from.isBefore(r.getFrom()) && to.isAfter(r.getTo()))) {
                return true;
            }
        }
        return false;
    }
}
