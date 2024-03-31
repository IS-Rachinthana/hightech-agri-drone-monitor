package com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.ClientInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientInformationRepository extends JpaRepository<ClientInformation, Integer> {
    ClientInformation save(ClientInformation clientInformation);

    List<ClientInformation> findAll();
}
