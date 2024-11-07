package plantNursary.app.core.models.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import plantNursary.app.core.models.enums.GroundType;
import plantNursary.app.core.models.enums.PlaceType;
import plantNursary.app.core.models.enums.PlantType;
import plantNursary.app.core.models.enums.WinterHardinessType;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Plant {
    private UUID uuid;
    private PlantType plantType;
    private String name;
    private Float height;
    private Float diameter;
    private WinterHardinessType hardinessType;
    private PlaceType placeType;
    private GroundType groundType;
    private String peculiarities;

    public Plant(PlantType plantType, String name, Float height, Float diameter, WinterHardinessType hardinessType, PlaceType placeType, GroundType groundType, String peculiarities) {
        this.uuid = UUID.randomUUID();
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
