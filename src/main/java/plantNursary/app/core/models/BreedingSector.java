package plantNursary.app.core.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class BreedingSector {
    private final UUID uuid;
    private List<Bed> beds;

    public BreedingSector(List<Bed> beds) {
        this.uuid = UUID.randomUUID();
        this.beds = beds;
    }

    public BreedingSector() {
        this.uuid = UUID.randomUUID();
        this.beds = new ArrayList<>();
    }

    public List<Bed> getBeds() {
        return beds;
    }

    public void setBeds(List<Bed> beds) {
        this.beds = beds;
    }

    public void addBed(Bed bed) {
        this.beds.add(bed);
    }

    public boolean deleteBed(Bed bed) {
        return this.beds.remove(bed);
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BreedingSector that)) return false;
        return Objects.equals(getBeds(), that.getBeds());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBeds());
    }

    @Override
    public String toString() {
        return "BreedingSector{" +
                "beds=" + beds +
                '}';
    }
}
