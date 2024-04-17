package com.nsbm.dronemonitor.hightechagridronemonitor.service.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.DronePilotDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.DronePilotModel;

import java.util.List;

public interface DronePilotService {
    DronePilotModel createDronePilot(DronePilotDto dronePilotDto);
    DronePilotModel getDronePilotById(Integer id);
    List<DronePilotModel> getAllDronePilots();
    DronePilotModel updateDronePilot(Integer id, DronePilotDto dronePilotDto);
    void deleteDronePilot(Integer id);
}
