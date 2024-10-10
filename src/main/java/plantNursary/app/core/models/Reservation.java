package plantNursary.app.core.models;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class Reservation {
    private final UUID uuid;
    private HashMap<Line, UUID> reservationList;
    private Date date;

    public Reservation(HashMap<Line, UUID> reservationList, Date date) {
        this.uuid = UUID.randomUUID();
        this.reservationList = reservationList;
        this.date = date;
    }

    public Reservation() {
        this.uuid = UUID.randomUUID();
        this.reservationList = new HashMap<>();
        this.date = new Date();
    }

    public HashMap<Line, UUID> getReservationList() {
        return reservationList;
    }

    public void setReservationList(HashMap<Line, UUID> reservationList) {
        this.reservationList = reservationList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UUID getUuid() {
        return uuid;
    }
}
