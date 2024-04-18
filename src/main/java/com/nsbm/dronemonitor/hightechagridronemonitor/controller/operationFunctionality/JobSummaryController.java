package com.nsbm.dronemonitor.hightechagridronemonitor.controller.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.JobSummaryDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.JobSummaryModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality.JobSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/jobSummary")
public class JobSummaryController {

    private final JobSummaryService jobSummaryService;

    @Autowired
    public JobSummaryController(JobSummaryService jobSummaryService) {
        this.jobSummaryService = jobSummaryService;
    }

    @PostMapping("/jobSummary")
    public ResponseEntity<JobSummaryModel> createJobSummary(@RequestBody JobSummaryDto jobSummaryDto) {
        JobSummaryModel newJobSummary = jobSummaryService.createJobSummary(jobSummaryDto);
        return new ResponseEntity<>(newJobSummary, HttpStatus.CREATED);
    }

    @GetMapping("/jobSummary/{id}")
    public ResponseEntity<JobSummaryModel> getJobSummary(@PathVariable Integer id) {
        JobSummaryModel jobSummary = jobSummaryService.getJobSummaryById(id);
        if (jobSummary != null) {
            return ResponseEntity.ok(jobSummary);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/jobSummary")
    public ResponseEntity<List<JobSummaryModel>> getAllJobSummaries() {
        List<JobSummaryModel> jobSummaries = jobSummaryService.getAllJobSummaries();
        return ResponseEntity.ok(jobSummaries);
    }

    @PutMapping("/jobSummary/{id}")
    public ResponseEntity<JobSummaryModel> updateJobSummary(@PathVariable Integer id, @RequestBody JobSummaryDto jobSummaryDto) {
        JobSummaryModel updatedJobSummary = jobSummaryService.updateJobSummary(id, jobSummaryDto);
        return ResponseEntity.ok(updatedJobSummary);
    }

    @DeleteMapping("/jobSummary/{id}")
    public ResponseEntity<?> deleteJobSummary(@PathVariable Integer id) {
        jobSummaryService.deleteJobSummary(id);
        return ResponseEntity.ok("Job Summary Information deleted successfully");
    }
}
