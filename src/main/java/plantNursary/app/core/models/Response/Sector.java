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
    private String name;
    private List<Line> lines;

    public Sector(Long id, String name, List<Line> lines) {
        this.id = id;
        this.name = name;
        this.lines = lines;
    }

    public Sector(Long id) {
        this.id = id;
        this.name = "Сектор";
        this.lines = new ArrayList<>();
    }
}
