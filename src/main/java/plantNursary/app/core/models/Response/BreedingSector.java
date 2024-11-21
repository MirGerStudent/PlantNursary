package plantNursary.app.core.models.Response;

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
    private Long id;
    private String name;
    private List<Bed> beds;

    public BreedingSector(Long id, String name, List<Bed> beds) {
        this.id = id;
        this.name = name;
        this.beds = beds;
    }

    public BreedingSector(Long id) {
        this.id = id;
        this.name = "Сектор разведения";
        this.beds = new ArrayList<>();
    }
}
