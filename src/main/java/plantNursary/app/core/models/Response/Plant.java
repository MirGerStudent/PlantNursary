package plantNursary.app.core.models.Response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Plant {
    private Long id;
    private String name;
    private String plantType;
    private Float height;
    private Float diameter;
    private String hardinessType;
    private String placeType;
    private String groundType;
    private String peculiarities;

    public Plant(Long id, String name, String plantType, Float height, Float diameter, String hardinessType,
            String placeType, String groundType, String peculiarities) {
        this.id = id;
        this.name = name;
        this.plantType = plantType;
        this.height = height;
        this.diameter = diameter;
        this.hardinessType = hardinessType;
        this.placeType = placeType;
        this.groundType = groundType;
        this.peculiarities = peculiarities;
    }
}
