package com.nsbm.dronemonitor.hightechagridronemonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nsbm.dronemonitor.hightechagridronemonitor.dto.DronePilotDTO;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.DronePilot;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.DronePilotRepository;

import java.util.List;

@RestController
public class DronePilotController {

    @Autowired
    private DronePilotRepository dronePilotRepository;

    @PostMapping("/dronePilot")
    public ResponseEntity<DronePilot> save(@RequestBody DronePilotDTO dronePilotDTO) {
        DronePilot dronePilot = convertToEntity(dronePilotDTO);
        dronePilot = dronePilotRepository.save(dronePilot);
        return new ResponseEntity<>(dronePilot, HttpStatus.CREATED);
    }

    private DronePilot convertToEntity(DronePilotDTO dto) {
        DronePilot dronePilot = new DronePilot();
        dronePilot.setPilotName(dto.getName());
        dronePilot.setPilotAddress(dto.getAddress());
        dronePilot.setPilotTel(dto.getTel());
        dronePilot.setPilotDob(dto.getDob());
        // Handle the rest of the mapping
        return dronePilot;
    }

    @GetMapping("/dronePilots")
    public ResponseEntity<List<DronePilot>> getAllDronePilots() {
        List<DronePilot> dronePilots = dronePilotRepository.findAll();
        return ResponseEntity.ok(dronePilots);
    }
}
