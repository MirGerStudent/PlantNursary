package plantNursary.app.core.models.DTO;

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
    private List<Field> fields;
    private List<QueenCell> queenCells;
    private List<BreedingSector> breedingSectors;
    private List<GreenHouse> greenHouses;
    private String name;

    public Nursary(List<Field> fields, List<QueenCell> queenCells, List<BreedingSector> breedingSectors, List<GreenHouse> greenHouses, String name) {
        this.fields = fields;
        this.queenCells = queenCells;
        this.breedingSectors = breedingSectors;
        this.greenHouses = greenHouses;
        this.name = name;
    }
}
