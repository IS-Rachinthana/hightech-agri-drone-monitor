package com.nsbm.dronemonitor.hightechagridronemonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nsbm.dronemonitor.hightechagridronemonitor.dto.dronePilotDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.dronePilot;

import java.util.List;

@RestController
public class dronePilotController {

    @Autowired
    private com.nsbm.dronemonitor.hightechagridronemonitor.repository.dronePilotRepository dronePilotRepository;

    @PostMapping("/dronePilot")
    public ResponseEntity<dronePilot> save(@RequestBody dronePilotDto dronePilotDTO) {
        dronePilot dronePilot = convertToEntity(dronePilotDTO);
        dronePilot = dronePilotRepository.save(dronePilot);
        return new ResponseEntity<>(dronePilot, HttpStatus.CREATED);
    }

    private dronePilot convertToEntity(dronePilotDto dto) {
        dronePilot dronePilot = new dronePilot();
        dronePilot.setPilotName(dto.getName());
        dronePilot.setPilotAddress(dto.getAddress());
        dronePilot.setPilotTel(dto.getTel());
        dronePilot.setPilotDob(dto.getDob());
        // Handle the rest of the mapping
        return dronePilot;
    }

    @GetMapping("/dronePilots")
    public ResponseEntity<List<dronePilot>> getAllDronePilots() {
        List<dronePilot> dronePilots = dronePilotRepository.findAll();
        return ResponseEntity.ok(dronePilots);
    }
}
