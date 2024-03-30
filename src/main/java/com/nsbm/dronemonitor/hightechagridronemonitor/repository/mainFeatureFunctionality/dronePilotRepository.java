package com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality;


import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.dronePilotModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface dronePilotRepository extends JpaRepository<dronePilotModel, Integer> {
}
