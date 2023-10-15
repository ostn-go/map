package com.ostn.map.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "map_details",
        indexes = {
                @Index(name = "BuildingFloorIdIndex", columnList = "buildingId, floorId")})
@ToString
@Getter
@Setter
@NoArgsConstructor
public class MapDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "building_id")
    private Long buildingId;

    @Column( name = "floor_id")
    private Long floorId;

    @Column(name = "map")
    private List<Integer> map;

    @Column(name = "axis_count")
    private Long axisCount;

    public MapDetails(Long id, Long buildingId, Long floorId, List<Integer> map, Long axisCount) {
        this.id = id;
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.map = map;
        this.axisCount = axisCount;
    }

}

