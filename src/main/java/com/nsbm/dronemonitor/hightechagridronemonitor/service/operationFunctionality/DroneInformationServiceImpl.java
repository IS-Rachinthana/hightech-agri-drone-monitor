package com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.DroneInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.DroneInformationModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.operationFunctionality.DroneInformationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneInformationServiceImpl implements DroneInformationService {

    @Autowired
    private DroneInformationRepository droneInformationRepository;

    @Override
    public DroneInformationModel createDroneInformation(DroneInformationDto droneInformationDto) {
        DroneInformationModel droneInformation = new DroneInformationModel();
        droneInformation.setDroneModel(droneInformationDto.getDroneModel());
        droneInformation.setOperatorName(droneInformationDto.getOperatorName());
        droneInformation.setOperatorContact(droneInformationDto.getOperatorContact());
        droneInformation.setDroneCapacity(droneInformationDto.getDroneCapacity());
        return droneInformationRepository.save(droneInformation);
    }

    @Override
    public DroneInformationModel getDroneInformationById(Integer droneId) {
        return droneInformationRepository.findById(droneId)
                .orElseThrow(() -> new EntityNotFoundException("Drone information not found with id: " + droneId));
    }

    @Override
    public List<DroneInformationModel> getAllDroneInformations() {
        return droneInformationRepository.findAll();
    }

    @Override
    public DroneInformationModel updateDroneInformation(Integer droneId, DroneInformationDto droneInformationDto) {
        DroneInformationModel droneInformation = getDroneInformationById(droneId);

        if (droneInformationDto.getDroneModel() != null) {
            droneInformation.setDroneModel(droneInformationDto.getDroneModel());
        }
        if (droneInformationDto.getOperatorName() != null) {
            droneInformation.setOperatorName(droneInformationDto.getOperatorName());
        }
        if (droneInformationDto.getOperatorContact() != null) {
            droneInformation.setOperatorContact(droneInformationDto.getOperatorContact());
        }
        if (droneInformationDto.getDroneCapacity() != null) {
            droneInformation.setDroneCapacity(droneInformationDto.getDroneCapacity());
        }

        return droneInformationRepository.save(droneInformation);
    }

    @Override
    public void deleteDroneInformation(Integer droneId) {
        DroneInformationModel droneInformation = getDroneInformationById(droneId);
        if (droneInformation != null) {
            droneInformationRepository.delete(droneInformation);
        } else {
            throw new EntityNotFoundException("Drone information not found with id: " + droneId);
        }
    }
}