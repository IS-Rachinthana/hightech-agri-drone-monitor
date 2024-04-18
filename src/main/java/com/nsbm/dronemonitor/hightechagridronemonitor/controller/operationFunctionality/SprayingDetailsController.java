package com.nsbm.dronemonitor.hightechagridronemonitor.controller.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.SprayingDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.SprayingDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality.SprayingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/sprayingDetails")
public class SprayingDetailsController {

    @Autowired
    private SprayingDetailsService sprayingDetailsService;

    @PostMapping("/sprayingDetails")
    public ResponseEntity<SprayingDetailsModel> createSprayingDetail(@RequestBody SprayingDetailsDto sprayingDetailsDto) {
        SprayingDetailsModel newSprayingDetail = sprayingDetailsService.createSprayingDetail(sprayingDetailsDto);
        return new ResponseEntity<>(newSprayingDetail, HttpStatus.CREATED);
    }

    @GetMapping("/sprayingDetails/{eventId}")
    public ResponseEntity<SprayingDetailsModel> getSprayingDetail(@PathVariable Integer eventId) {
        SprayingDetailsModel sprayingDetail = sprayingDetailsService.getSprayingDetailById(eventId);
        if (sprayingDetail != null) {
            return ResponseEntity.ok(sprayingDetail);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/sprayingDetails")
    public ResponseEntity<List<SprayingDetailsModel>> getAllSprayingDetails() {
        List<SprayingDetailsModel> sprayingDetails = sprayingDetailsService.getAllSprayingDetails();
        return ResponseEntity.ok(sprayingDetails);
    }

    @PutMapping("/sprayingDetails/{eventId}")
    public ResponseEntity<SprayingDetailsModel> updateSprayingDetail(@PathVariable Integer eventId, @RequestBody SprayingDetailsDto sprayingDetailsDto) {
        SprayingDetailsModel updatedSprayingDetail = sprayingDetailsService.updateSprayingDetail(eventId, sprayingDetailsDto);
        return ResponseEntity.ok(updatedSprayingDetail);
    }

    @DeleteMapping("/sprayingDetails/{eventId}")
    public ResponseEntity<?> deleteSprayingDetail(@PathVariable Integer eventId) {
        sprayingDetailsService.deleteSprayingDetail(eventId);
        return ResponseEntity.ok("Spraying Details deleted successfully");
    }
}