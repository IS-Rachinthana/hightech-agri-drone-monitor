package com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.JobDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.JobDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality.JobDetailsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobDetailsServiceImpl implements JobDetailsService {

    @Autowired
    private JobDetailsRepository jobDetailsRepository;

    @Override
    public JobDetailsModel createJobDetail(JobDetailsDto jobDetailsDto) {
        JobDetailsModel jobDetail = new JobDetailsModel();
        jobDetail.setInventoryId(jobDetailsDto.getInventoryId());
        jobDetail.setJobStartDate(jobDetailsDto.getJobStartDate());
        jobDetail.setFieldLocation(jobDetailsDto.getFieldLocation());
        jobDetail.setCompanyProjectName(jobDetailsDto.getCompanyProjectName());
        jobDetail.setFieldType(jobDetailsDto.getFieldType());
        jobDetail.setJobDescription(jobDetailsDto.getJobDescription());
        return jobDetailsRepository.save(jobDetail);
    }

    @Override
    public JobDetailsModel getJobDetailById(Integer jobId) {
        return jobDetailsRepository.findById(jobId)
                .orElseThrow(() -> new EntityNotFoundException("Job detail not found with id: " + jobId));
    }

    @Override
    public List<JobDetailsModel> getAllJobDetails() {
        return jobDetailsRepository.findAll();
    }

    @Override
    public JobDetailsModel updateJobDetail(Integer jobId, JobDetailsDto jobDetailsDto) {
        JobDetailsModel jobDetail = getJobDetailById(jobId);
        if (jobDetailsDto.getInventoryId() != null) {
            jobDetail.setInventoryId(jobDetailsDto.getInventoryId());
        }
        if (jobDetailsDto.getJobStartDate() != null) {
            jobDetail.setJobStartDate(jobDetailsDto.getJobStartDate());
        }
        if (jobDetailsDto.getFieldLocation() != null) {
            jobDetail.setFieldLocation(jobDetailsDto.getFieldLocation());
        }
        if (jobDetailsDto.getCompanyProjectName() != null) {
            jobDetail.setCompanyProjectName(jobDetailsDto.getCompanyProjectName());
        }
        if (jobDetailsDto.getFieldType() != null) {
            jobDetail.setFieldType(jobDetailsDto.getFieldType());
        }
        if (jobDetailsDto.getJobDescription() != null) {
            jobDetail.setJobDescription(jobDetailsDto.getJobDescription());
        }

        return jobDetailsRepository.save(jobDetail);
    }

    @Override
    public void deleteJobDetail(Integer jobId) {
        if (!jobDetailsRepository.existsById(jobId)) {
            throw new EntityNotFoundException("Job detail not found with id: " + jobId);
        }
        jobDetailsRepository.deleteById(jobId);
    }
}