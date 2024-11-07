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
    private List<Sector> sectors;
    private String name;

    public Field(Long id , List<Sector> sectors, String name) {
        this.id = id;
        this.sectors = sectors;
        this.name = name;
    }

    public Field(Long id) {
        this.id = id;
        this.sectors = new ArrayList<>();
        this.name = "Поле";
    }
}
