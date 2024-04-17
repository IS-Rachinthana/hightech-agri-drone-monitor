package com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality;


import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.ClientInformationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientInformationRepository extends JpaRepository<ClientInformationModel, Integer> {
}
