package com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.JobSummaryDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.JobSummaryModel;

import java.util.List;
public interface JobSummaryService {
        JobSummaryModel createJobSummary(JobSummaryDto jobSummaryDto);
        JobSummaryModel getJobSummaryById(Integer reportId);
        List<JobSummaryModel> getAllJobSummaries();
        JobSummaryModel updateJobSummary(Integer reportId, JobSummaryDto jobSummaryDto);
        void deleteJobSummary(Integer reportId);
    }
