package com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality;


import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.DronePilotModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DronePilotRepository extends JpaRepository<DronePilotModel, Integer> {
}
