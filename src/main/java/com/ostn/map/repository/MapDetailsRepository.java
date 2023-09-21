package com.ostn.map.repository;

import com.ostn.map.entity.MapDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapDetailsRepository extends JpaRepository<MapDetails, Long> {
}