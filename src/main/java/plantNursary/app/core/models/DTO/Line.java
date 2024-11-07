package plantNursary.app.core.models.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import plantNursary.app.core.models.enums.EventType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Line {
    private Plant plant;
    private Integer countOfPlants;
    private Date dateOfPlanting;
    private List<EventType> events;
    private String name;

    public Line(Plant plant, Integer countOfPlants, Date dateOfPlanting, List<EventType> events, String name) {
        this.plant = plant;
        this.countOfPlants = countOfPlants;
        this.dateOfPlanting = dateOfPlanting;
        this.events = events;
        this.name = name;
    }

    public Line(Plant plant, Integer countOfPlants) {
        this.dateOfPlanting = new Date();
        this.events = new ArrayList<>();
        this.name = "Грядка";
    }
}
