package com.ostn.map.controller;

import com.ostn.map.entity.MapDetails;
import com.ostn.map.entity.TransportModeDetails;
import com.ostn.map.services.MapDetailsService;
import com.ostn.map.services.TransportModeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/ostn")
public class TransportModeController {

    @Autowired
    private TransportModeDetailsService transportModeDetailsService;

    @PostMapping("/transport_mode")
    public java.util.List<TransportModeDetails> addNewMap(@RequestBody List<TransportModeDetails> mapDetails) {
        return transportModeDetailsService.addNewMode(mapDetails);
    }

    @GetMapping(value = "/transport_mode/{buildingId}")
    public List<TransportModeDetails> getModesByBuilding(@PathVariable Long buildingId) throws IOException {
        return transportModeDetailsService.getModeByBuildingId(buildingId);
    }
}
