package plantNursary.app.core.models.Response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Reservation {
    private Long id;
    private String name;
    private List<Line> reservationList;
    private Date date;

    public Reservation(Long id, List<Line> reservationList, Date date, String name) {
        this.id = id;
        this.reservationList = reservationList;
        this.date = date;
        this.name = name;
    }

    public Reservation(Long id) {
        this.id = id;
        this.reservationList = new ArrayList<>();
        this.date = new Date();
        this.name = "Резервация";
    }
}
