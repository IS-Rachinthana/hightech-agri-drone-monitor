package com.nsbm.dronemonitor.hightechagridronemonitor.controller.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.dronePilotDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.dronePilotModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class droneInfomationController {


    @Autowired
    private com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality.droneInfomationRepository droneInfomationRepository;

    @PostMapping("/droneInfomationModel")
    public ResponseEntity<droneInfomationModel> save(@RequestBody droneInfomationDto droneInfomationDTO) {
        droneInfomationModel droneInfomationModel = convertToEntity(droneInfomationDTO);
        droneInfomationModel = droneInfomationRepository.save(droneInfomationModel);
        return new ResponseEntity<>(droneInfomationModel, HttpStatus.CREATED);
    }

    private droneInfomationModel convertToEntity(droneInfomationDto dto) {
        droneInfomationModel droneInfomationModel = new droneInfomationModel();
        droneInfomationModel.setDroneModel(dto.getModel());
        droneInfomationModel.setDroneOperatorName(dto.getOperatorName());
        droneInfomationModel.setDroneOperatorContact(dto.getOperatorContact());
        // Handle the rest of the mapping
        return droneInfomationModel;
    }

    @GetMapping("/droneInfomations")
    public ResponseEntity<List<droneInfomationModel>> getAllDroneInfomations() {
        List<droneInfomationModel> droneInfomationModels = droneInfomationRepository.findAll();
        return ResponseEntity.ok(droneInfomationModels);
    }
}
