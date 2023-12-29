package com.ostn.map.repository;

import com.ostn.map.entity.MapDetails;
import com.ostn.map.entity.TransportModeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransportModeDetailsRepository  extends JpaRepository<TransportModeDetails, Long> {


    List<TransportModeDetails> findByBuildingId(Long buildingId);

}
