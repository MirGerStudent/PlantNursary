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
public class QueenCell {
    private Long id;
    private String name;
    private List<Plant> plants;

    public QueenCell(Long id, String name, List<Plant> plants) {
        this.id = id;
        this.name = name;
        this.plants = plants;
    }

    public QueenCell(Long id) {
        this.id = id;
        this.name = "Маточник";
        this.plants = new ArrayList<>();
    }
}
