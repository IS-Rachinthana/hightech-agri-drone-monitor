package com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.TransportationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransportationDetailsRepository extends JpaRepository<TransportationDetails, Integer> {
}
