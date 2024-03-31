package com.nsbm.dronemonitor.hightechagridronemonitor.controller.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.dronePilotModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.dronePilotDto;

import java.util.List;

@RestController
public class dronePilotController {

    @Autowired
    private com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality.dronePilotRepository dronePilotRepository;

    @PostMapping("/dronePilot")
    public ResponseEntity<dronePilotModel> save(@RequestBody dronePilotDto dronePilotDTO) {
        dronePilotModel dronePilotModel = convertToEntity(dronePilotDTO);
        dronePilotModel = dronePilotRepository.save(dronePilotModel);
        return new ResponseEntity<>(dronePilotModel, HttpStatus.CREATED);
    }

    private dronePilotModel convertToEntity(dronePilotDto dto) {
        dronePilotModel dronePilotModel = new dronePilotModel();
        dronePilotModel.setPilotName(dto.getName());
        dronePilotModel.setPilotAddress(dto.getAddress());
        dronePilotModel.setPilotTel(dto.getTel());
        dronePilotModel.setPilotDob(dto.getDob());
        // Handle the rest of the mapping
        return dronePilotModel;
    }

    @GetMapping("/dronePilots")
    public ResponseEntity<List<dronePilotModel>> getAllDronePilots() {
        List<dronePilotModel> dronePilotModels = dronePilotRepository.findAll();
        return ResponseEntity.ok(dronePilotModels);
    }
}
