package com.nsbm.dronemonitor.hightechagridronemonitor.controller.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.DronePilotModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality.DronePilotRepository;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.mainFeatureFunctionality.DronePilotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.DronePilotDto;

import java.util.List;

@RestController
//@RequestMapping("/dronePilots")
public class DronePilotController {

    @Autowired
    private DronePilotService dronePilotService;

    @PostMapping("/dronePilots")
    public ResponseEntity<DronePilotModel> createDronePilot(@RequestBody DronePilotDto dronePilotDto) {
        DronePilotModel newDronePilot = dronePilotService.createDronePilot(dronePilotDto);
        return new ResponseEntity<>(newDronePilot, HttpStatus.CREATED);
    }

    @GetMapping("/dronePilots/{id}")
    public ResponseEntity<DronePilotModel> getDronePilot(@PathVariable Integer id) {
        DronePilotModel dronePilot = dronePilotService.getDronePilotById(id);
        return ResponseEntity.ok(dronePilot);
    }

    @GetMapping("/dronePilots")
    public ResponseEntity<List<DronePilotModel>> getAllDronePilots() {
        List<DronePilotModel> dronePilots = dronePilotService.getAllDronePilots();
        return ResponseEntity.ok(dronePilots);
    }

    @PutMapping("/dronePilots/{id}")
    public ResponseEntity<DronePilotModel> updateDronePilot(@PathVariable Integer id, @RequestBody DronePilotDto dronePilotDto) {
        DronePilotModel updatedDronePilot = dronePilotService.updateDronePilot(id, dronePilotDto);
        return ResponseEntity.ok(updatedDronePilot);
    }

    @DeleteMapping("/dronePilots/{id}")
    public ResponseEntity<?> deleteDronePilot(@PathVariable Integer id) {
        dronePilotService.deleteDronePilot(id);
        return ResponseEntity.ok("Drone pilot deleted successfully");
    }
}


