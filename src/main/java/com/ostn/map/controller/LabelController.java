package com.ostn.map.controller;


import com.ostn.map.entity.LabelDetails;
import com.ostn.map.services.LabelDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ostn/v1/label")
@Slf4j
public class LabelController {
    private final LabelDetailsService labelDetailsService;
    public LabelController(LabelDetailsService labelDetailsService) {
        this.labelDetailsService = labelDetailsService;
    }

    @PostMapping("/")
    public List<LabelDetails> addLabels(@RequestBody List<LabelDetails> labelDetails) {
        log.info("Label details {} ", labelDetails);
        return labelDetailsService.addLabels(labelDetails);
    }

    @GetMapping("/get/{buildingId}")
    public List<LabelDetails> getLabelByBuildingId(@PathVariable Long buildingId) {
        return labelDetailsService.getLabelsByBuildingId(buildingId);
    }
}
