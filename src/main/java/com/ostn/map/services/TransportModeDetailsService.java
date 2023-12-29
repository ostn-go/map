package com.ostn.map.services;

import com.ostn.map.entity.TransportModeDetails;
import com.ostn.map.repository.MapDetailsRepository;
import com.ostn.map.repository.TransportModeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportModeDetailsService {

    @Autowired
    private TransportModeDetailsRepository transportModeDetailsRepository;
    public List<TransportModeDetails> addNewMode(List<TransportModeDetails> TransportModeDetails) {
        return transportModeDetailsRepository.saveAll(TransportModeDetails);
    }

    public Optional<TransportModeDetails> getModes(Long id) {
        return transportModeDetailsRepository.findById(id);
    }

    public List<TransportModeDetails> getModeByBuildingId(Long buildingId) {
        return transportModeDetailsRepository.findByBuildingId(buildingId);
    }
}
