package com.nsbm.dronemonitor.hightechagridronemonitor.controller.jobFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.TransportationDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.TransportationDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality.TransportationDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;


@RestController
//@RequestMapping("/transportationDetails")
public class TransportationDetailsController {

    @Autowired
    private TransportationDetailsService transportationDetailsService;

    @PostMapping("/transportationDetails")
    public ResponseEntity<TransportationDetailsModel> createTransportationDetail(@RequestBody TransportationDetailsDto transportationDetailsDto) {
        TransportationDetailsModel newTransportationDetail = transportationDetailsService.createTransportationDetail(transportationDetailsDto);
        return new ResponseEntity<>(newTransportationDetail, HttpStatus.CREATED);
    }

    @GetMapping("/transportationDetails/{id}")
    public ResponseEntity<TransportationDetailsModel> getTransportationDetail(@PathVariable Integer id) {
        TransportationDetailsModel transportationDetail = transportationDetailsService.getTransportationDetailById(id);
        return ResponseEntity.ok(transportationDetail);
    }

    @GetMapping("/transportationDetails")
    public ResponseEntity<List<TransportationDetailsModel>> getAllTransportationDetails() {
        List<TransportationDetailsModel> transportationDetails = transportationDetailsService.getAllTransportationDetails();
        return ResponseEntity.ok(transportationDetails);
    }

    @PutMapping("/transportationDetails/{id}")
    public ResponseEntity<TransportationDetailsModel> updateTransportationDetail(@PathVariable Integer id, @RequestBody TransportationDetailsDto transportationDetailsDto) {
        TransportationDetailsModel updatedTransportationDetail = transportationDetailsService.updateTransportationDetail(id, transportationDetailsDto);
        return ResponseEntity.ok(updatedTransportationDetail);
    }

    @DeleteMapping("/transportationDetails/{id}")
    public ResponseEntity<?> deleteTransportationDetail(@PathVariable Integer id) {
        transportationDetailsService.deleteTransportationDetail(id);
        return ResponseEntity.ok("Transportation Details deleted successfully");
    }
}