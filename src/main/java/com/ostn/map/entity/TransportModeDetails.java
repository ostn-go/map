package com.ostn.map.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name = "mode_details")
public class TransportModeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    private Long buildingId;

    private Long xCoordinate;

    private Long yCoordinate;

    private Long floorId;

    private String mode;

    public TransportModeDetails() {
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

    public Long getFloorId() {
        return floorId;
    }

    public void setFloorId(Long floorId) {
        this.floorId = floorId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
