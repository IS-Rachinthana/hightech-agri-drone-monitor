package com.nsbm.dronemonitor.hightechagridronemonitor.Job.controller;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.dto.JobDetailsDTO;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.JobDetails;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository.JobDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class JobDetailsController {
    @Autowired
    //JobDetailsService jobDetailsService;
    private JobDetailsRepository jobDetailsRepository;

    @PostMapping("/jobDescription")
    public ResponseEntity<JobDetails> save(@RequestBody JobDetailsDTO jobDetailsDTO) {
        JobDetails jobDetails = convertToEntity(jobDetailsDTO);
        jobDetails = jobDetailsRepository.save(jobDetails);
        return new ResponseEntity<>(jobDetails, HttpStatus.CREATED);
    }

    private JobDetails convertToEntity(JobDetailsDTO dto) {
        JobDetails jobDetails = new JobDetails();
        jobDetails.setInventoryId(dto.getInventoryId());
        jobDetails.setDate(dto.getDate());
        jobDetails.setFieldLocation(dto.getFieldLocation());
        jobDetails.setCompanyProjectName(dto.getCompanyProjectName());
        //Handle the rest of the mapping
        return jobDetails;
    }

    @GetMapping("/jobDescription")
    public ResponseEntity<List<JobDetails>> getAllJobDetails() {
        List<JobDetails> jobDetails = jobDetailsRepository.findAll();
        return ResponseEntity.ok(jobDetails);
    }

   // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    //public String greeting() {return "Hello SpringBoot";}

   // @RequestMapping(value = "/hello", method = RequestMethod.POST)
   // public String helloWorld2() { return "My First POST API"; }

   // @RequestMapping(value = "/jobDetails", method = RequestMethod.POST)
   // public JobDetails save(@RequestBody JobDetails jobDetails) {return jobDetailsService.save(jobDetails);}
}

