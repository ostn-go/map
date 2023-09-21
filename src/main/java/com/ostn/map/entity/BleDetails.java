package com.ostn.map.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ble_details")
public class BleDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mac_address;

    private Double x_coordinate;

    private Double y_coordinate;

    private Long buildingId;

    public BleDetails() {
    }

    public BleDetails(Long id, String mac_address, Double x_coordinate, Double y_coordinate, Long buildingId) {
        this.id = id;
        this.mac_address = mac_address;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.buildingId = buildingId;
    }

    public BleDetails(String mac_address, Double x_coordinate, Double y_coordinate, Long buildingId) {
        this.mac_address = mac_address;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.buildingId = buildingId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public Double getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(Double x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public Double getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(Double y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    @Override
    public String toString() {
        return "BleDetails{" +
                "id=" + id +
                ", mac_address='" + mac_address + '\'' +
                ", x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                ", buildingId=" + buildingId +
                '}';
    }
}
