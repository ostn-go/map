package com.ostn.map.entity;

import com.ostn.map.model.Coordinates;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "map_details")
public class MapDetails {

    @Id
    private Long buildingId;
    private List<Integer> map;
    private Long axisCount;

    public MapDetails() {
    }

    public MapDetails(Long buildingId, List<Integer> map, Long axisCount) {
        this.buildingId = buildingId;
        this.map = map;
        this.axisCount = axisCount;
    }

    public MapDetails(List<Integer> map, Long axisCount) {
        this.map = map;
        this.axisCount = axisCount;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
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

    @Override
    public String toString() {
        return "MapDetails{" +
                "buildingId=" + buildingId +
                ", map=" + map +
                ", axisCount=" + axisCount +
                '}';
    }
}
