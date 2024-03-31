package com.nsbm.dronemonitor.hightechagridronemonitor.Job.controller;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.dto.FieldDetailsDTO;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.FieldDetails;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository.FieldDetailsRepository;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.service.FieldDetailsService;
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
public class FieldDetailsController {
    @Autowired
    //FieldDetailsService fieldDetailsService;
    private FieldDetailsRepository fieldDetailsRepository;

    @PostMapping("/fieldDetails")
    public ResponseEntity<FieldDetails> save(@RequestBody FieldDetailsDTO fieldDetailsDTO) {
        FieldDetails fieldDetails = convertToEntity(fieldDetailsDTO);
        fieldDetails = fieldDetailsRepository.save(fieldDetails);
        return new ResponseEntity<>(fieldDetails, HttpStatus.CREATED);
    }

    private FieldDetails convertToEntity(FieldDetailsDTO dto) {
        FieldDetails fieldDetails = new FieldDetails();
        fieldDetails.setPaddyFieldSize(dto.getPaddyFieldSize());
        fieldDetails.setArea(dto.getArea());
        //Handle the rest of the mapping
        return fieldDetails;
    }

    @GetMapping("//fieldDetails")
    public ResponseEntity<List<FieldDetails>> getAllFieldDetails() {
        List<FieldDetails> fieldDetails = fieldDetailsRepository.findAll();
        return ResponseEntity.ok(fieldDetails);
    }

   // @RequestMapping(value = "/hello", method = RequestMethod.GET)
   // public String greeting() {return "Hello SpringBoot";}

  //  @RequestMapping(value = "/hello", method = RequestMethod.POST)
   // public String helloWorld2() { return "My First POST API"; }

   // @RequestMapping(value = "/fieldDetails", method = RequestMethod.POST)
   // public FieldDetails save(@RequestBody FieldDetails fieldDetails) {return fieldDetailsService.save(fieldDetails);}
}


