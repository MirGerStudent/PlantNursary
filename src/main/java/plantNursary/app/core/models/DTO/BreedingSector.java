package plantNursary.app.core.models.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BreedingSector {
    private List<Bed> beds;
    private String name;

    public BreedingSector(List<Bed> beds, String name) {
        this.beds = beds;
        this.name = name;
    }

    public BreedingSector() {
        this.beds = new ArrayList<>();
        this.name = "Сектор разведения";
    }
}
