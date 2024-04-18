package com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.FlightInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.FlightInformationModel;

import java.util.List;

public interface FlightInformationService {
    FlightInformationModel createFlightInformation(FlightInformationDto flightInformationDto);
    FlightInformationModel getFlightInformationById(Integer flightId);
    List<FlightInformationModel> getAllFlightInformations();
    FlightInformationModel updateFlightInformation(Integer flightId, FlightInformationDto flightInformationDto);
    void deleteFlightInformation(Integer flightId);
}