package com.nsbm.dronemonitor.hightechagridronemonitor.repository.operationFunctionality;


import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.FlightInformationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightInformationRepository extends JpaRepository<FlightInformationModel, Integer> {
}