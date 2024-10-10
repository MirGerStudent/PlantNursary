package plantNursary.app.core.models;

import plantNursary.app.core.models.enums.EventType;

import java.util.*;

public class Line {
    private UUID uuid;
    private Plant plant;
    private Integer countOfPlants;
    private Date dateOfPlanting;
    private List<EventType> events;

    public Line(Plant plant, Integer countOfPlants, Date dateOfPlanting, List<EventType> events) {
        this.uuid = UUID.randomUUID();
        this.plant = plant;
        this.countOfPlants = countOfPlants;
        this.dateOfPlanting = dateOfPlanting;
        this.events = events;
    }

    public Line(Plant plant, Integer countOfPlants) {
        this.uuid = UUID.randomUUID();
        this.dateOfPlanting = new Date();
        this.events = new ArrayList<>();
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public Integer getCountOfPlants() {
        return countOfPlants;
    }

    public void setCountOfPlants(Integer countOfPlants) {
        this.countOfPlants = countOfPlants;
    }

    public Date getDateOfPlanting() {
        return dateOfPlanting;
    }

    public void setDateOfPlanting(Date dateOfPlanting) {
        this.dateOfPlanting = dateOfPlanting;
    }

    public List<EventType> getEvents() {
        return events;
    }

    public void setEvents(List<EventType> events) {
        this.events = events;
    }

    public void addEvent(EventType event) {
        this.events.add(event);
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return Objects.equals(getPlant(), line.getPlant()) && Objects.equals(getCountOfPlants(), line.getCountOfPlants()) && Objects.equals(getDateOfPlanting(), line.getDateOfPlanting()) && Objects.equals(getEvents(), line.getEvents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlant(), getCountOfPlants(), getDateOfPlanting(), getEvents());
    }

    @Override
    public String toString() {
        return "Line{" +
                "plant=" + plant +
                ", countOfPlants=" + countOfPlants +
                ", dateOfPlanting=" + dateOfPlanting +
                ", events=" + events +
                '}';
    }
}
