package com.nsbm.dronemonitor.hightechagridronemonitor.controller.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.DroneInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.DroneInformationModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality.DroneInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/droneInformation")
public class DroneInformationController {

    @Autowired
    private DroneInformationService droneInformationService;

    @PostMapping("/droneInformation")
    public ResponseEntity<DroneInformationModel> createDroneInformation(@RequestBody DroneInformationDto droneInformationDto) {
        DroneInformationModel newDroneInformation = droneInformationService.createDroneInformation(droneInformationDto);
        return new ResponseEntity<>(newDroneInformation, HttpStatus.CREATED);
    }

    @GetMapping("/droneInformation/{id}")
    public ResponseEntity<DroneInformationModel> getDroneInformation(@PathVariable Integer id) {
        DroneInformationModel droneInformation = droneInformationService.getDroneInformationById(id);
        return ResponseEntity.ok(droneInformation);
    }

    @GetMapping("/droneInformation")
    public ResponseEntity<List<DroneInformationModel>> getAllDroneInformations() {
        List<DroneInformationModel> droneInformations = droneInformationService.getAllDroneInformations();
        return ResponseEntity.ok(droneInformations);
    }

    @PutMapping("/droneInformation/{id}")
    public ResponseEntity<DroneInformationModel> updateDroneInformation(@PathVariable Integer id, @RequestBody DroneInformationDto droneInformationDto) {
        DroneInformationModel updatedDroneInformation = droneInformationService.updateDroneInformation(id, droneInformationDto);
        return ResponseEntity.ok(updatedDroneInformation);
    }

    @DeleteMapping("/droneInformation/{id}")
    public ResponseEntity<?> deleteDroneInformation(@PathVariable Integer id) {
        droneInformationService.deleteDroneInformation(id);
        return ResponseEntity.ok("Drone Information deleted successfully");
    }
}