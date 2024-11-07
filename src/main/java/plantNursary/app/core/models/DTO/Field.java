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
public class Field {
    private final UUID uuid;
    private List<Sector> sectors;
    private String name;

    public Field(List<Sector> sectors, String name) {
        this.uuid = UUID.randomUUID();
        this.sectors = sectors;
        this.name = name;
    }

    public Field() {
        this.uuid = UUID.randomUUID();
        this.sectors = new ArrayList<>();
        this.name = "Поле";
    }
}
