package com.nsbm.dronemonitor.hightechagridronemonitor.controller.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.FlightInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.FlightInformationModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality.FlightInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/flightInformation")
public class FlightInformationController {

    @Autowired
    private FlightInformationService flightInformationService;

    @PostMapping("/flightInformation")
    public ResponseEntity<FlightInformationModel> createFlightInformation(@RequestBody FlightInformationDto flightInformationDto) {
        FlightInformationModel newFlightInformation = flightInformationService.createFlightInformation(flightInformationDto);
        return new ResponseEntity<>(newFlightInformation, HttpStatus.CREATED);
    }

    @GetMapping("/flightInformation/{id}")
    public ResponseEntity<FlightInformationModel> getFlightInformation(@PathVariable Integer id) {
        FlightInformationModel flightInformation = flightInformationService.getFlightInformationById(id);
        return ResponseEntity.ok(flightInformation);
    }

    @GetMapping("/flightInformation")
    public ResponseEntity<List<FlightInformationModel>> getAllFlightInformations() {
        List<FlightInformationModel> flightInformations = flightInformationService.getAllFlightInformations();
        return ResponseEntity.ok(flightInformations);
    }

    @PutMapping("/flightInformation/{id}")
    public ResponseEntity<FlightInformationModel> updateFlightInformation(@PathVariable Integer id, @RequestBody FlightInformationDto flightInformationDto) {
        FlightInformationModel updatedFlightInformation = flightInformationService.updateFlightInformation(id, flightInformationDto);
        return ResponseEntity.ok(updatedFlightInformation);
    }

    @DeleteMapping("/flightInformation/{id}")
    public ResponseEntity<?> deleteFlightInformation(@PathVariable Integer id) {
        flightInformationService.deleteFlightInformation(id);
        return ResponseEntity.ok("Flight Information deleted successfully");
    }
}