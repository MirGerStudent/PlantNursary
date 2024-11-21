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
    private Long id;
    private String name;
    private Plant plant;
    private Integer countOfPlants;
    private Date dateOfPlanting;
    private List<EventType> events;

    public Line(Long id, String name, Plant plant, Integer countOfPlants, Date dateOfPlanting, List<EventType> events) {
        this.id = id;
        this.name = name;
        this.plant = plant;
        this.countOfPlants = countOfPlants;
        this.dateOfPlanting = dateOfPlanting;
        this.events = events;
    }

    public Line(Long id, Plant plant, Integer countOfPlants) {
        this.id = id;
        this.name = "Грядка";
        this.dateOfPlanting = new Date();
        this.events = new ArrayList<>();
    }
}
