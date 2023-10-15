package com.ostn.map.repository;

import com.ostn.map.entity.LabelDetails;
import com.ostn.map.entity.MapDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapDetailsRepository extends JpaRepository<MapDetails, Long> {
   MapDetails findByBuildingIdAndFloorId(Long buildingId,Long floorId);
}