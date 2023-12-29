package com.ostn.map.services;

import com.ostn.map.entity.BuildingDetails;
import com.ostn.map.entity.LabelDetails;
import com.ostn.map.repository.BuildingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingDetailsService {

    @Autowired
    private BuildingDetailsRepository buildingDetailsRepository;

    public List<BuildingDetails> addBuildingDetails(List<BuildingDetails> buildingDetails) {
        return buildingDetailsRepository.saveAll(buildingDetails);
    }

    public BuildingDetails addBuildingDetail(BuildingDetails buildingDetail) {
        return buildingDetailsRepository.save(buildingDetail);
    }

    public List<BuildingDetails> getAllBuildingDetails() {
        return buildingDetailsRepository.findAll();
    }
}
