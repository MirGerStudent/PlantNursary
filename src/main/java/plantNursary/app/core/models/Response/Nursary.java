package plantNursary.app.core.models.Response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Nursary {
    private Long id;
    private String name;
    private List<Field> fields;
    private List<QueenCell> queenCells;
    private List<BreedingSector> breedingSectors;
    private List<GreenHouse> greenHouses;

    public Nursary(Long id, 
            String name, List<Field> fields, List<QueenCell> queenCells, List<BreedingSector> breedingSectors,
            List<GreenHouse> greenHouses) {
        this.id = id;
        this.name = name;
        this.fields = fields;
        this.queenCells = queenCells;
        this.breedingSectors = breedingSectors;
        this.greenHouses = greenHouses;
    }
}
