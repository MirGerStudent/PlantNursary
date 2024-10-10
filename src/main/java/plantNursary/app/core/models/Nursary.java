package plantNursary.app.core.models;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Nursary {
    private UUID uuid;
    private List<Field> fields;
    private List<QueenCell> queenCells;
    private List<BreedingSector> breedingSectors;
    private List<GreenHouse> greenHouses;

    public Nursary(List<Field> fields, List<QueenCell> queenCells, List<BreedingSector> breedingSectors, List<GreenHouse> greenHouses) {
        this.fields = fields;
        this.queenCells = queenCells;
        this.breedingSectors = breedingSectors;
        this.greenHouses = greenHouses;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<QueenCell> getQueenCells() {
        return queenCells;
    }

    public void setQueenCells(List<QueenCell> queenCells) {
        this.queenCells = queenCells;
    }

    public List<BreedingSector> getBreedingSectors() {
        return breedingSectors;
    }

    public void setBreedingSectors(List<BreedingSector> breedingSectors) {
        this.breedingSectors = breedingSectors;
    }

    public List<GreenHouse> getGreenHouses() {
        return greenHouses;
    }

    public void setGreenHouses(List<GreenHouse> greenHouses) {
        this.greenHouses = greenHouses;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nursary nursary)) return false;
        return Objects.equals(getFields(), nursary.getFields()) && Objects.equals(getQueenCells(), nursary.getQueenCells()) && Objects.equals(getBreedingSectors(), nursary.getBreedingSectors()) && Objects.equals(getGreenHouses(), nursary.getGreenHouses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFields(), getQueenCells(), getBreedingSectors(), getGreenHouses());
    }

    @Override
    public String toString() {
        return "Nursary{" +
                "fields=" + fields +
                ", queenCells=" + queenCells +
                ", breedingSectors=" + breedingSectors +
                ", greenHouses=" + greenHouses +
                '}';
    }
}
