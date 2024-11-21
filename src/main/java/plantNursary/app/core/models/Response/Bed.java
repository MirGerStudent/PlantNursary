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
    private String name;
    private List<Plant> plants;

    public Bed(Long id, String name, List<Plant> plants) {
        this.id = id;
        this.name = name;
        this.plants = plants;
    }

    public Bed() {
        this.id = 0L;
        this.name = "Клумба";
        this.plants = new ArrayList<>();
    }
}
