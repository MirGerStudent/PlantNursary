package plantNursary.app.core.models;

import plantNursary.app.core.models.enums.GroundType;
import plantNursary.app.core.models.enums.PlaceType;
import plantNursary.app.core.models.enums.PlantType;
import plantNursary.app.core.models.enums.WinterHardinessType;

import java.util.Objects;
import java.util.UUID;

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

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getDiameter() {
        return diameter;
    }

    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }

    public WinterHardinessType getHardinessType() {
        return hardinessType;
    }

    public void setHardinessType(WinterHardinessType hardinessType) {
        this.hardinessType = hardinessType;
    }

    public PlaceType getPlaceType() {
        return placeType;
    }

    public void setPlaceType(PlaceType placeType) {
        this.placeType = placeType;
    }

    public GroundType getGroundType() {
        return groundType;
    }

    public void setGroundType(GroundType groundType) {
        this.groundType = groundType;
    }

    public String getPeculiarities() {
        return peculiarities;
    }

    public void setPeculiarities(String peculiarities) {
        this.peculiarities = peculiarities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant plant)) return false;
        return getPlantType() == plant.getPlantType() && Objects.equals(getName(), plant.getName()) && Objects.equals(getHeight(), plant.getHeight()) && Objects.equals(getDiameter(), plant.getDiameter()) && getHardinessType() == plant.getHardinessType() && getPlaceType() == plant.getPlaceType() && getGroundType() == plant.getGroundType() && Objects.equals(getPeculiarities(), plant.getPeculiarities());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlantType(), getName(), getHeight(), getDiameter(), getHardinessType(), getPlaceType(), getGroundType(), getPeculiarities());
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plantType=" + plantType +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", diameter=" + diameter +
                ", hardinessType=" + hardinessType +
                ", placeType=" + placeType +
                ", groundType=" + groundType +
                ", peculiarities='" + peculiarities + '\'' +
                '}';
    }
}
