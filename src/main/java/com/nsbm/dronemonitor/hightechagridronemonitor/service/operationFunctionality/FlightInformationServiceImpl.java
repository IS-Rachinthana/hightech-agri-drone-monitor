package com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.FlightInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.FlightInformationModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.operationFunctionality.FlightInformationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightInformationServiceImpl implements FlightInformationService {

    @Autowired
    private FlightInformationRepository flightInformationRepository;

    @Override
    public FlightInformationModel createFlightInformation(FlightInformationDto flightInformationDto) {
        FlightInformationModel flightInformation = new FlightInformationModel();
        flightInformation.setDroneID(flightInformationDto.getDroneID());
        flightInformation.setFlightStartTime(flightInformationDto.getFlightStartTime());
        flightInformation.setFlightEndTime(flightInformationDto.getFlightEndTime());
        flightInformation.setTotalFlightDuration(flightInformationDto.getTotalFlightDuration());
        return flightInformationRepository.save(flightInformation);
    }

    @Override
    public FlightInformationModel getFlightInformationById(Integer flightId) {
        return flightInformationRepository.findById(flightId)
                .orElseThrow(() -> new EntityNotFoundException("Flight information not found with id: " + flightId));
    }

    @Override
    public List<FlightInformationModel> getAllFlightInformations() {
        return flightInformationRepository.findAll();
    }

    @Override
    public FlightInformationModel updateFlightInformation(Integer flightId, FlightInformationDto flightInformationDto) {
        FlightInformationModel flightInformation = getFlightInformationById(flightId);

        if (flightInformationDto.getDroneID() != null) {
            flightInformation.setDroneID(flightInformationDto.getDroneID());
        }
        if (flightInformationDto.getFlightStartTime() != null) {
            flightInformation.setFlightStartTime(flightInformationDto.getFlightStartTime());
        }
        if (flightInformationDto.getFlightEndTime() != null) {
            flightInformation.setFlightEndTime(flightInformationDto.getFlightEndTime());
        }
        if (flightInformationDto.getTotalFlightDuration() != null) {
            flightInformation.setTotalFlightDuration(flightInformationDto.getTotalFlightDuration());
        }

        return flightInformationRepository.save(flightInformation);
    }

    @Override
    public void deleteFlightInformation(Integer flightId) {
        FlightInformationModel flightInformation = getFlightInformationById(flightId);
        if (flightInformation != null) {
            flightInformationRepository.delete(flightInformation);
        } else {
            throw new EntityNotFoundException("Flight information not found with id: " + flightId);
        }
    }
}