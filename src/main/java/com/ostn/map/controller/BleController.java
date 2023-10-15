package com.ostn.map.controller;

import com.ostn.map.entity.BleDetails;
import com.ostn.map.entity.MapDetails;
import com.ostn.map.services.BleDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/ostn/v1/ble")
public class BleController {
    private final BleDetailsService bleDetailsService;

    public BleController(BleDetailsService bleDetailsService) {
        this.bleDetailsService = bleDetailsService;
    }

    // Add a new BLE device
    @PostMapping("/")
    public BleDetails addBleDevice(@RequestBody BleDetails bleDetails) {
        log.info(bleDetails.toString());
        return bleDetailsService.addNewBle(bleDetails);
    }

    // Get all BLEs
    @GetMapping("/all")
    public List<BleDetails> getAllBle() {
        return bleDetailsService.getAllBle();
    }

    //Get ble by Id
    @GetMapping("/{id}")
    public Optional<BleDetails> getBleById(@PathVariable Long id) {
        log.info("Requested id: {}", id);
        return bleDetailsService.getBleById(id);
    }
}
