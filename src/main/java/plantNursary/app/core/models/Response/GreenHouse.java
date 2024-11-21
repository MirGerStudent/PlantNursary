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
public class GreenHouse {
    private final Long id;
    private String name;
    private List<Plant> plants;

    public GreenHouse(Long id, String name, List<Plant> plants) {
        this.id = id;
        this.name = name;
        this.plants = plants;
    }

    public GreenHouse(long id) {
        this.id = id;
        this.name = "Теплица";
        this.plants = new ArrayList<>();
    }
}
