package com.ostn.map.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "map_details")
@ToString
@Getter
@Setter
public class MapDetails {

    @Id
    @Column( name = "building_id")
    private Long buildingId;

    @Column(name = "map")
    private List<Integer> map;

    @Column(name = "axis_count")
    private Long axisCount;

    public MapDetails() {
    }

    public void setMap(List<Integer> map) {
        this.map = map;
    }
}
