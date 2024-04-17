package com.nsbm.dronemonitor.hightechagridronemonitor.service.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.DronePilotDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.DronePilotModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality.DronePilotRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DronePilotServicesImpl implements DronePilotService {

    private final DronePilotRepository dronePilotRepository;

    @Autowired
    public DronePilotServicesImpl(DronePilotRepository dronePilotRepository) {
        this.dronePilotRepository = dronePilotRepository;
    }

    @Override
    public DronePilotModel createDronePilot(DronePilotDto dronePilotDto) {
        DronePilotModel dronePilot = new DronePilotModel();
        // Assume setters are present in the DronePilotModel class corresponding to DTO fields
        dronePilot.setPilotName(dronePilotDto.getName());
        dronePilot.setPilotAddress(dronePilotDto.getAddress());
        dronePilot.setPilotTel(dronePilotDto.getTel());
        dronePilot.setPilotDob(dronePilotDto.getDob());
        return dronePilotRepository.save(dronePilot);
    }

    @Override
    public DronePilotModel getDronePilotById(Integer id) {
        return dronePilotRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Drone pilot not found with id: " + id));
    }

    @Override
    public List<DronePilotModel> getAllDronePilots() {
        return dronePilotRepository.findAll();
    }

    @Override
    public DronePilotModel updateDronePilot(Integer id, DronePilotDto dronePilotDto) {
        DronePilotModel dronePilot = dronePilotRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Drone pilot not found with id: " + id));

        // Update the entity using the provided DTO

        if (dronePilotDto.getName() != null) {
            dronePilot.setPilotName(dronePilotDto.getName());
        }
        if (dronePilotDto.getAddress() != null) {
            dronePilot.setPilotAddress(dronePilotDto.getAddress());
        }
        if (dronePilotDto.getTel() != null) {
            dronePilot.setPilotTel(dronePilotDto.getTel());
        }
        if (dronePilotDto.getDob() != null) {
            dronePilot.setPilotDob(dronePilotDto.getDob());
        }
        return dronePilotRepository.save(dronePilot);
    }

    @Override
    public void deleteDronePilot(Integer id) {
        if (!dronePilotRepository.existsById(id)) {
            throw new EntityNotFoundException("Drone pilot not found with id: " + id);
        }
        dronePilotRepository.deleteById(id);
    }
}
