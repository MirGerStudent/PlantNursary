package plantNursary.app.core.models.Response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import plantNursary.app.core.models.enums.EventType;

import java.util.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Line {
    private UUID uuid;
    private Plant plant;
    private Integer countOfPlants;
    private Date dateOfPlanting;
    private List<EventType> events;
    private String name;

    public Line(Plant plant, Integer countOfPlants, Date dateOfPlanting, List<EventType> events, String name) {
        this.uuid = UUID.randomUUID();
        this.plant = plant;
        this.countOfPlants = countOfPlants;
        this.dateOfPlanting = dateOfPlanting;
        this.events = events;
        this.name = name;
    }

    public Line(Plant plant, Integer countOfPlants) {
        this.uuid = UUID.randomUUID();
        this.dateOfPlanting = new Date();
        this.events = new ArrayList<>();
        this.name = "Грядка";
    }
}
