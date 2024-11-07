package plantNursary.app.core.models.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Plant {
    private String plantType;
    private String name;
    private Float height;
    private Float diameter;
    private String hardinessType;
    private String placeType;
    private String groundType;
    private String peculiarities;

    public Plant(String plantType, String name, Float height, Float diameter, String hardinessType, String placeType,
            String groundType, String peculiarities) {
        this.plantType = plantType;
        this.name = name;
        this.height = height;
        this.diameter = diameter;
        this.hardinessType = hardinessType;
        this.placeType = placeType;
        this.groundType = groundType;
        this.peculiarities = peculiarities;
    }
}
