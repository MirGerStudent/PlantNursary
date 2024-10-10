package plantNursary.app.core.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BreedingSector {
    private final UUID uuid;
    private List<Bed> beds;
    private String name;

    public BreedingSector(List<Bed> beds, String name) {
        this.uuid = UUID.randomUUID();
        this.beds = beds;
        this.name = name;
    }

    public BreedingSector() {
        this.uuid = UUID.randomUUID();
        this.beds = new ArrayList<>();
        this.name = "Сектор разведения";
    }
}
