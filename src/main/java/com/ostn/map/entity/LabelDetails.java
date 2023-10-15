package com.ostn.map.entity;

import com.ostn.map.model.Coordinates;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name = "label_details")
public class LabelDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    private Long buildingId;

    @Nonnull
    private Long xCoordinate;

    @Nonnull
    private Long yCoordinate;

    private Long floor;

    @Nonnull
    private String labelName;

    private String iconName;

    @Nonnull
    private Long labelId;
    @Nonnull
    private Long floorId;
    private String description;

    public LabelDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Nonnull
    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(@Nonnull Long buildingId) {
        this.buildingId = buildingId;
    }

    @Nonnull
    public Long getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(@Nonnull Long xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    @Nonnull
    public Long getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(@Nonnull Long yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Long getFloor() {
        return floor;
    }

    public void setFloor(Long floor) {
        this.floor = floor;
    }

    @Nonnull
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(@Nonnull String labelName) {
        this.labelName = labelName;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    @Nonnull
    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(@Nonnull Long labelId) {
        this.labelId = labelId;
    }

    @Nonnull
    public Long getFloorId() {
        return floorId;
    }

    public void setFloorId(@Nonnull Long floorId) {
        this.floorId = floorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}