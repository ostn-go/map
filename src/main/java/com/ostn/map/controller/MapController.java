package com.ostn.map.controller;

import com.ostn.map.entity.BleDetails;
import com.ostn.map.entity.MapDetails;
import com.ostn.map.services.BleDetailsService;
import com.ostn.map.services.MapDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ostn")
public class MapController {
    @Autowired
    private MapDetailsService mapDetailsService;

    @PostMapping("/map")
    public MapDetails addNewMap(@RequestBody MapDetails mapDetails) {
        System.out.println(mapDetails.toString());
        return mapDetailsService.addNewMap(mapDetails);
    }

    @GetMapping("/map/{id}")
    public Optional<MapDetails> getMapById(@PathVariable Long id) {
        System.out.println("Requested id: " + id);
        return mapDetailsService.getMap(id);
    }
}
