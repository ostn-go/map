package com.ostn.map.controller;

import com.ostn.map.entity.BleDetails;
import com.ostn.map.entity.MapDetails;
import com.ostn.map.services.BleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ostn")
public class BleController {
    @Autowired
    private BleDetailsService bleDetailsService;

    // Add a new BLE device
    @PostMapping("/ble")
    public BleDetails addBleDevice(@RequestBody BleDetails bleDetails) {
        System.out.println(bleDetails.toString());
        return bleDetailsService.addNewBle(bleDetails);
    }

    // Get all BLEs
    @GetMapping("/ble/all")
    public List<BleDetails> getAllBle() {
        return bleDetailsService.getAllBle();
    }

    //Get ble by Id
    @GetMapping("/ble/{id}")
    public Optional<BleDetails> getBleById(@PathVariable Long id) {
        System.out.println("Requested id: " + id);
        return bleDetailsService.getBleById(id);
    }
}
