package plantNursary.app.core.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Sector {
    private UUID uuid;
    private List<Line> lines;

    public Sector(List<Line> lines) {
        this.uuid = UUID.randomUUID();
        this.lines = lines;
    }

    public Sector() {
        this.uuid = UUID.randomUUID();
        this.lines = new ArrayList<>();
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public void addLine(Line line) {
        this.lines.add(line);
    }

    public boolean deleteLine(Line line) {
        return this.lines.remove(line);
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sector sector)) return false;
        return Objects.equals(getLines(), sector.getLines());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLines());
    }

    @Override
    public String toString() {
        return "Sector{" +
                "lines=" + lines +
                '}';
    }
}
