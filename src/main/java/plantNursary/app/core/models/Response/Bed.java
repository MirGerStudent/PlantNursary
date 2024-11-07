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
public class Bed {
    private Long id;
    private List<Plant> plants;
    private String name;

    public Bed(Long id, List<Plant> plants, String name) {
        this.id = id;
        this.plants = plants;
        this.name = name;
    }

    public Bed() {
        this.id = 0L;
        this.plants = new ArrayList<>();
        this.name = "Клумба";
    }
}
