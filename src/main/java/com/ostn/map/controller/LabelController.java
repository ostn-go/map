package com.ostn.map.controller;

import com.ostn.map.entity.BleDetails;
import com.ostn.map.entity.LabelDetails;
import com.ostn.map.entity.MapDetails;
import com.ostn.map.services.BleDetailsService;
import com.ostn.map.services.LabelDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ostn/label")
public class LabelController {

    @Autowired
    private LabelDetailsService labelDetailsService;
    @PostMapping("/add")
    public List<LabelDetails> addLabels(@RequestBody List<LabelDetails> labelDetails) {
        System.out.println(labelDetails.toString());
        return labelDetailsService.addLabels(labelDetails);
    }

    @GetMapping("/get/{buildingId}")
    public List<LabelDetails> getLabelByBuildingId(@PathVariable Long buildingId) {
        return labelDetailsService.getLabelsByBuildingId(buildingId);
    }
}
