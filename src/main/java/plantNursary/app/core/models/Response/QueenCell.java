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
    private List<Plant> plants;
    private String name;

    public QueenCell(Long id, List<Plant> plants, String name) {
        this.id = id;
        this.plants = plants;
        this.name = name;
    }

    public QueenCell(Long id) {
        this.id = id;
        this.plants = new ArrayList<>();
        this.name = "Маточник";
    }
}
