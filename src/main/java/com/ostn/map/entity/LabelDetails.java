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

    public LabelDetails() {
    }

    public LabelDetails(Long id, Long buildingId, Long xCoordinate, Long yCoordinate, Long floor, String labelName, String iconName) {
        this.id = id;
        this.buildingId = buildingId;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.floor = floor;
        this.labelName = labelName;
        this.iconName = iconName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public Long getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Long xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Long getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Long yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Long getFloor() {
        return floor;
    }

    public void setFloor(Long floor) {
        this.floor = floor;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
}