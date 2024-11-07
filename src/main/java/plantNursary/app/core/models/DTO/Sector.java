package plantNursary.app.core.models.DTO;

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
public class Sector {
    private List<Line> lines;
    private String name;

    public Sector(List<Line> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    public Sector() {
        this.lines = new ArrayList<>();
        this.name = "Сектор";
    }
}
