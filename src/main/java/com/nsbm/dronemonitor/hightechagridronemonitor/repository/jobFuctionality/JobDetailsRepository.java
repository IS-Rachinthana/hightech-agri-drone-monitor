package com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.JobDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDetailsRepository extends JpaRepository<JobDetailsModel, Integer> {
}