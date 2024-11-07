package plantNursary.app.core.models.Response;

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
public class Sector {
    private UUID uuid;
    private List<Line> lines;
    private String name;

    public Sector(List<Line> lines, String name) {
        this.uuid = UUID.randomUUID();
        this.lines = lines;
        this.name = name;
    }

    public Sector() {
        this.uuid = UUID.randomUUID();
        this.lines = new ArrayList<>();
        this.name = "Сектор";
    }
}
