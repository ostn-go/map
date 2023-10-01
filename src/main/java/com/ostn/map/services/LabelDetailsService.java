package com.ostn.map.services;

import com.ostn.map.entity.BleDetails;
import com.ostn.map.entity.LabelDetails;
import com.ostn.map.repository.LabelDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelDetailsService {

    @Autowired
    private LabelDetailsRepository labelDetailsRepository;

    public List<LabelDetails> addLabels(List<LabelDetails> labelDetails) {
        return labelDetailsRepository.saveAll(labelDetails);
    }

    public List<LabelDetails> getLabelsByBuildingId(Long buildingId) {
        return labelDetailsRepository.findByBuildingId(buildingId);
    }
}
