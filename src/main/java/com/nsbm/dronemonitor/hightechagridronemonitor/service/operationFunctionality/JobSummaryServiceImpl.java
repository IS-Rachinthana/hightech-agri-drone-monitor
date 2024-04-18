package com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.JobSummaryDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.JobSummaryModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.operationFunctionality.JobSummaryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSummaryServiceImpl implements JobSummaryService {

    @Autowired
    private JobSummaryRepository jobSummaryRepository;

    @Override
    public JobSummaryModel createJobSummary(JobSummaryDto jobSummaryDto) {
        JobSummaryModel jobSummary = new JobSummaryModel();
        jobSummary.setOperatorName(jobSummaryDto.getOperatorName());
        jobSummary.setNextSprayingDate(jobSummaryDto.getNextSprayingDate());
        jobSummary.setIssuesFaced(jobSummaryDto.getIssuesFaced());
        jobSummary.setAdditionalNotes(jobSummaryDto.getAdditionalNotes());
        jobSummary.setBeforeSprayingPicture(jobSummaryDto.getBeforeSprayingPicture());
        jobSummary.setAfterSprayingPicture(jobSummaryDto.getAfterSprayingPicture());
        jobSummary.setRecommendations(jobSummaryDto.getRecommendations());
        jobSummary.setAddTrRecommendations(jobSummaryDto.getAddTrRecommendations());
        return jobSummaryRepository.save(jobSummary);
    }

    @Override
    public JobSummaryModel getJobSummaryById(Integer reportId) {
        return jobSummaryRepository.findById(reportId)
                .orElseThrow(() -> new EntityNotFoundException("Job Summary not found with id: " + reportId));
    }

    @Override
    public List<JobSummaryModel> getAllJobSummaries() {
        return jobSummaryRepository.findAll();
    }

    @Override
    public JobSummaryModel updateJobSummary(Integer reportId, JobSummaryDto jobSummaryDto) {
        JobSummaryModel jobSummary = getJobSummaryById(reportId);

        if (jobSummaryDto.getOperatorName() != null) {
            jobSummary.setOperatorName(jobSummaryDto.getOperatorName());
        }
        if (jobSummaryDto.getNextSprayingDate() != null) {
            jobSummary.setNextSprayingDate(jobSummaryDto.getNextSprayingDate());
        }
        if (jobSummaryDto.getIssuesFaced() != null) {

            jobSummary.setIssuesFaced(jobSummaryDto.getIssuesFaced());
        }
        if (jobSummaryDto.getAdditionalNotes() != null) {
            jobSummary.setAdditionalNotes(jobSummaryDto.getAdditionalNotes());
        }
        if (jobSummaryDto.getBeforeSprayingPicture() != null) {
            jobSummary.setBeforeSprayingPicture(jobSummaryDto.getBeforeSprayingPicture());
        }
        if (jobSummaryDto.getAfterSprayingPicture() != null) {
            jobSummary.setAfterSprayingPicture(jobSummaryDto.getAfterSprayingPicture());
        }
        if (jobSummaryDto.getRecommendations() != null) {
            jobSummary.setRecommendations(jobSummaryDto.getRecommendations());
        }
        if (jobSummaryDto.getAddTrRecommendations() != null) {
            jobSummary.setAddTrRecommendations(jobSummaryDto.getAddTrRecommendations());
        }

        return jobSummaryRepository.save(jobSummary);
    }

    @Override
    public void deleteJobSummary(Integer reportId) {
        JobSummaryModel jobSummary = getJobSummaryById(reportId);
        if (jobSummary != null) {
            jobSummaryRepository.delete(jobSummary);
        } else {
            throw new EntityNotFoundException("Job Summary not found with id: " + reportId);
        }
    }
}