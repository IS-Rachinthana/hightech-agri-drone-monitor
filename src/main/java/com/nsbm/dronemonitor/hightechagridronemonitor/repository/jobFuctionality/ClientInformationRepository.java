package com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality;


import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.ClientInformation;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.dronePilotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientInformationRepository extends JpaRepository<ClientInformation, Integer> {

}
