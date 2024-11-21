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
public class Field {
    private Long id;
    private String name;
    private List<Sector> sectors;

    public Field(Long id, String name, List<Sector> sectors) {
        this.id = id;
        this.name = name;
        this.sectors = sectors;
    }

    public Field(Long id) {
        this.id = id;
        this.name = "Поле";
        this.sectors = new ArrayList<>();
    }
}
