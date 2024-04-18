package com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.DroneInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.DroneInformationModel;

import java.util.List;

public interface DroneInformationService {
    DroneInformationModel createDroneInformation(DroneInformationDto droneInformationDto);
    DroneInformationModel getDroneInformationById(Integer droneId);
    List<DroneInformationModel> getAllDroneInformations();
    DroneInformationModel updateDroneInformation(Integer droneId, DroneInformationDto droneInformationDto);
    void deleteDroneInformation(Integer droneId);
}