package com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.JobDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.JobDetailsModel;

import java.util.List;

public interface JobDetailsService {
    JobDetailsModel createJobDetail(JobDetailsDto jobDetailsDto);
    JobDetailsModel getJobDetailById(Integer jobId);
    List<JobDetailsModel> getAllJobDetails();
    JobDetailsModel updateJobDetail(Integer jobId, JobDetailsDto jobDetailsDto);
    void deleteJobDetail(Integer jobId);
}