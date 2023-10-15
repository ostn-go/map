package com.ostn.map.services;

import com.ostn.map.entity.MapDetails;
import com.ostn.map.repository.MapDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MapDetailsService {
    private final MapDetailsRepository mapDetailsRepository;
    public MapDetailsService(MapDetailsRepository mapDetailsRepository) {
        this.mapDetailsRepository = mapDetailsRepository;
    }
    public MapDetails addNewMap(MapDetails mapDetails) {
        return mapDetailsRepository.save(mapDetails);
    }
    public Optional<MapDetails> getMap(Long id) {
        return mapDetailsRepository.findById(id);
    }
}
