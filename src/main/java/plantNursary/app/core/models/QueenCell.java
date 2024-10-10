package plantNursary.app.core.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class QueenCell {
    private final UUID uuid;
    private List<Plant> plants;

    public QueenCell(List<Plant> plants) {
        this.uuid = UUID.randomUUID();
        this.plants = plants;
    }

    public QueenCell() {
        this.uuid = UUID.randomUUID();
        this.plants = new ArrayList<>();
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public void addPlant(Plant plant) {
        this.plants.add(plant);
    }

    public boolean deletePlant(Plant plant) {
        return this.plants.remove(plant);
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bed bed)) return false;
        return Objects.equals(getPlants(), bed.getPlants());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPlants());
    }

    @Override
    public String toString() {
        return "QueenCell{" +
                "plants=" + plants +
                '}';
    }
}
