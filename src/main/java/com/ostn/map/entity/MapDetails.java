package com.ostn.map.entity;

import com.ostn.map.model.Coordinates;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "map_details",
        indexes = {
        @Index(name = "BuildingFloorIdIndex", columnList = "buildingId, floorId")})
public class MapDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long buildingId;

    private Long floorId;

    private List<Integer> map;
    private Long axisCount;

    public MapDetails() {
    }

    public MapDetails(Long id, Long buildingId, Long floorId, List<Integer> map, Long axisCount) {
        this.id = id;
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.map = map;
        this.axisCount = axisCount;
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

    public Long getFloorId() {
        return floorId;
    }

    public void setFloorId(Long floorId) {
        this.floorId = floorId;
    }

    public List<Integer> getMap() {
        return map;
    }

    public void setMap(List<Integer> map) {
        this.map = map;
    }

    public Long getAxisCount() {
        return axisCount;
    }

    public void setAxisCount(Long axisCount) {
        this.axisCount = axisCount;
    }
}

