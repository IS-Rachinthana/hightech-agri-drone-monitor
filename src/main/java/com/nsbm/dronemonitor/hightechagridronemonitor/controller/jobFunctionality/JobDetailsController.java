package com.nsbm.dronemonitor.hightechagridronemonitor.controller.jobFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.JobDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.JobDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality.JobDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
//@RequestMapping("/jobDetails")
public class JobDetailsController {

    @Autowired
    private JobDetailsService jobDetailsService;

    @PostMapping("/jobDetails")
    public ResponseEntity<JobDetailsModel> createJobDetail(@RequestBody JobDetailsDto jobDetailsDto) {
        JobDetailsModel newJobDetail = jobDetailsService.createJobDetail(jobDetailsDto);
        return new ResponseEntity<>(newJobDetail, HttpStatus.CREATED);
    }

    @GetMapping("/jobDetails/{id}")
    public ResponseEntity<JobDetailsModel> getJobDetail(@PathVariable Integer id) {
        JobDetailsModel jobDetail = jobDetailsService.getJobDetailById(id);
        return ResponseEntity.ok(jobDetail);
    }

    @GetMapping("/jobDetails")
    public ResponseEntity<List<JobDetailsModel>> getAllJobDetails() {
        List<JobDetailsModel> jobDetails = jobDetailsService.getAllJobDetails();
        return ResponseEntity.ok(jobDetails);
    }

    @PutMapping("/jobDetails/{id}")
    public ResponseEntity<JobDetailsModel> updateJobDetail(@PathVariable Integer id, @RequestBody JobDetailsDto jobDetailsDto) {
        JobDetailsModel updatedJobDetail = jobDetailsService.updateJobDetail(id, jobDetailsDto);
        return ResponseEntity.ok(updatedJobDetail);
    }

    @DeleteMapping("/jobDetails/{id}")
    public ResponseEntity<?> deleteJobDetail(@PathVariable Integer id) {
        jobDetailsService.deleteJobDetail(id);
        return ResponseEntity.ok("Job Details deleted successfully");
    }
}

