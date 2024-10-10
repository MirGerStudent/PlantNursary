package plantNursary.app.core.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Field {
    private final UUID uuid;
    private List<Sector> sectors;

    public Field(List<Sector> sectors) {
        this.uuid = UUID.randomUUID();
        this.sectors = sectors;
    }

    public Field() {
        this.uuid = UUID.randomUUID();
        this.sectors = new ArrayList<>();
    }

    public List<Sector> getSectors() {
        return sectors;
    }

    public void setSectors(List<Sector> sectors) {
        this.sectors = sectors;
    }

    public void addSector(Sector sector) {
        this.sectors.add(sector);
    }

    public boolean deleteSector(Sector sector) {
        return this.sectors.remove(sector);
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field field)) return false;
        return Objects.equals(getSectors(), field.getSectors());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSectors());
    }

    @Override
    public String toString() {
        return "Field{" +
                "sectors=" + sectors +
                '}';
    }
}
