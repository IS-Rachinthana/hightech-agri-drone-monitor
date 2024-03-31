package com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.TransportationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransportationDetailsRepository extends JpaRepository<TransportationDetails, Integer> {
    TransportationDetails save(TransportationDetails transportationDetails);

    List<TransportationDetails> findAll();
}
