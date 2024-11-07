package plantNursary.app.core.models.DTO;

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
public class GreenHouse {
    private List<Plant> plants;
    private String name;

    public GreenHouse(List<Plant> plants, String name) {
        this.plants = plants;
        this.name = name;
    }

    public GreenHouse() {
        this.plants = new ArrayList<>();
        this.name = "Теплица";
    }
}
