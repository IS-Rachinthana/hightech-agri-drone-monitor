package com.nsbm.dronemonitor.hightechagridronemonitor.repository.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.JobSummaryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSummaryRepository extends JpaRepository<JobSummaryModel, Integer> {
}