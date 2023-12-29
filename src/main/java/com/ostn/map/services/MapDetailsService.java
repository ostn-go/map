package com.ostn.map.services;

import com.ostn.map.entity.MapDetails;
import com.ostn.map.repository.MapDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MapDetailsService {

    @Autowired
    private MapDetailsRepository mapDetailsRepository;
    public List<MapDetails> addNewMap(List<MapDetails> mapDetails) {
        return mapDetailsRepository.saveAll(mapDetails);
    }

    public Optional<MapDetails> getMap(Long id) {
        return mapDetailsRepository.findById(id);
    }

    public List<MapDetails> getMapByBuildingId(Long buildingId) {
        return mapDetailsRepository.findByBuildingId(buildingId);
    }

    public MapDetails getMapByFloorIdAndBuildingId(Long buildingId, Long floorId) {
        return mapDetailsRepository.findByBuildingIdAndFloorId(buildingId,floorId);
    }
}
