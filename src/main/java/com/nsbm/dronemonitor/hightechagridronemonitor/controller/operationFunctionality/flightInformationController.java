package com.nsbm.dronemonitor.hightechagridronemonitor.controller.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.flightInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.flightInformationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class flightInformationController {

    @Autowired
    private com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality.flightInformationRepository flightInformationRepository;

    @PostMapping("/flightInformationModel")
    public ResponseEntity<flightInformationModel> save(@RequestBody flightInformationDto flightInformationDTO) {
        flightInformationModel flightInformationModel = convertToEntity(flightInformationDTO);
        flightInformationModel = flightInformationRepository.save(flightInformationModel);
        return new ResponseEntity<>(flightInformationModel, HttpStatus.CREATED);
    }

    private flightInformationModel convertToEntity(flightInformationDto dto) {
        flightInformationModel flightInformationModel = new flightInformationModel();
        flightInformationModel.setPilotName(dto.getName());
        flightInformationModel.setPilotAddress(dto.getAddress());
        flightInformationModel.setPilotTel(dto.getTel());
        flightInformationModel.setPilotDob(dto.getDob());
        // Handle the rest of the mapping
        return flightInformationModel;
    }

    @GetMapping("/flightInformations")
    public ResponseEntity<List<flightInformationModel>> getAllflightInformations() {
        List<flightInformationModel> flightInformationModels = flightInformationRepository.findAll();
        return ResponseEntity.ok(flightInformationModels);
    }
}
