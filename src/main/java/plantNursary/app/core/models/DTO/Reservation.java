package plantNursary.app.core.models.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Reservation {
    private HashMap<Line, UUID> reservationList;
    private Date date;
    private String name;

    public Reservation(HashMap<Line, UUID> reservationList, Date date, String name) {
        this.reservationList = reservationList;
        this.date = date;
        this.name = name;
    }

    public Reservation() {
        this.reservationList = new HashMap<>();
        this.date = new Date();
        this.name = "Резервация";
    }
}
