package com.ostn.map.services;

import com.ostn.map.entity.BleDetails;
import com.ostn.map.repository.BleDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BleDetailsService {
    @Autowired
    private BleDetailsRepository bleDetailsRepository;

    // Add a BLE device
    public BleDetails addNewBle(BleDetails bleDetails) {
        return bleDetailsRepository.save(bleDetails);
    }

    // Get BLE by ID
    public Optional<BleDetails> getBleById(Long id) {
        return bleDetailsRepository.findById(id);
    }

    // get all BLE
    public List<BleDetails> getAllBle() {
        return bleDetailsRepository.findAll();
    }


}

