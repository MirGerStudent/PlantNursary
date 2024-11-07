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
    private List<Bed> beds;
    private String name;

    public BreedingSector(Long id, List<Bed> beds, String name) {
        this.id = id;
        this.beds = beds;
        this.name = name;
    }

    public BreedingSector(Long id) {
        this.id = id;
        this.beds = new ArrayList<>();
        this.name = "Сектор разведения";
    }
}
