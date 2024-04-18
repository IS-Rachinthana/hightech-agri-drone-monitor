package com.nsbm.dronemonitor.hightechagridronemonitor.repository.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.DroneInformationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneInformationRepository extends JpaRepository<DroneInformationModel, Integer> {
}