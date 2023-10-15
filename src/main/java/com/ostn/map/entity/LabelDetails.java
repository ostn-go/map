package com.ostn.map.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "label_details")
@ToString
@NoArgsConstructor
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


}