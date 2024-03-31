package com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.JobDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobDetailsRepository extends JpaRepository<JobDetails, Integer> {
    JobDetails save(JobDetails jobDetails);

    List<JobDetails> findAll();
}
