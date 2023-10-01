package com.ostn.map.repository;

import com.ostn.map.entity.LabelDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LabelDetailsRepository extends JpaRepository<LabelDetails, Long> {
    List<LabelDetails> findByBuildingId(Long buildingId);
}