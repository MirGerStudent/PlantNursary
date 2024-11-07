package plantNursary.app.core.models.Response;

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
    private Long id;
    private HashMap<Line, UUID> reservationList;
    private Date date;
    private String name;

    public Reservation(Long id, HashMap<Line, UUID> reservationList, Date date, String name) {
        this.id = id;
        this.reservationList = reservationList;
        this.date = date;
        this.name = name;
    }

    public Reservation(Long id) {
        this.id = id;
        this.reservationList = new HashMap<>();
        this.date = new Date();
        this.name = "Резервация";
    }
}
