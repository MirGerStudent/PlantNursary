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
public class Sector {
    private Long id;
    private List<Line> lines;
    private String name;

    public Sector(Long id, List<Line> lines, String name) {
        this.id = id;
        this.lines = lines;
        this.name = name;
    }

    public Sector(Long id) {
        this.id = id;
        this.lines = new ArrayList<>();
        this.name = "Сектор";
    }
}
