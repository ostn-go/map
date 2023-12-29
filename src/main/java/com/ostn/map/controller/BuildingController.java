package com.ostn.map.controller;

import com.ostn.map.entity.BuildingDetails;
import com.ostn.map.entity.LabelDetails;
import com.ostn.map.services.BuildingDetailsService;
import com.ostn.map.services.LabelDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ostn/building")
public class BuildingController {

    @Autowired
    private BuildingDetailsService buildingDetailsService;
    @PostMapping("/add")
    public List<BuildingDetails> addBuildingDetails(@RequestBody List<BuildingDetails> buildingDetails) {
        return buildingDetailsService.addBuildingDetails(buildingDetails);
    }

    @GetMapping("/get")
    public List<BuildingDetails> getBuildingDetails () {
        return buildingDetailsService.getAllBuildingDetails();
    }
}
