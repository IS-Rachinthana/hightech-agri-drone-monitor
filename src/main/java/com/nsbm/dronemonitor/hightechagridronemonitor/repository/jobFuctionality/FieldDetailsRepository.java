package com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.FieldDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FieldDetailsRepository extends JpaRepository<FieldDetails, Integer> {
    FieldDetails save(FieldDetails fieldDetails);

    List<FieldDetails> findAll();
}
