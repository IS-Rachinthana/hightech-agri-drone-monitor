package com.nsbm.dronemonitor.hightechagridronemonitor.controller.jobFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.FieldDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.FieldDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality.FieldDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;


@RestController
//@RequestMapping("/fieldDetails")
public class FieldDetailsController {

    @Autowired
    private FieldDetailsService fieldDetailsService;

    @PostMapping("/fieldDetails")
    public ResponseEntity<FieldDetailsModel> createFieldDetail(@RequestBody FieldDetailsDto fieldDetailsDto) {
        FieldDetailsModel newFieldDetail = fieldDetailsService.createFieldDetail(fieldDetailsDto);
        return new ResponseEntity<>(newFieldDetail, HttpStatus.CREATED);
    }

    @GetMapping("/fieldDetails/{id}")
    public ResponseEntity<FieldDetailsModel> getFieldDetail(@PathVariable Integer id) {
        FieldDetailsModel fieldDetail = fieldDetailsService.getFieldDetailById(id);
        return ResponseEntity.ok(fieldDetail);
    }

    @GetMapping("/fieldDetails")
    public ResponseEntity<List<FieldDetailsModel>> getAllFieldDetails() {
        List<FieldDetailsModel> fieldDetails = fieldDetailsService.getAllFieldDetails();
        return ResponseEntity.ok(fieldDetails);
    }

    @PutMapping("/fieldDetails/{id}")
    public ResponseEntity<FieldDetailsModel> updateFieldDetail(@PathVariable Integer id, @RequestBody FieldDetailsDto fieldDetailsDto) {
        FieldDetailsModel updatedFieldDetail = fieldDetailsService.updateFieldDetail(id, fieldDetailsDto);
        return ResponseEntity.ok(updatedFieldDetail);
    }

    @DeleteMapping("/fieldDetails/{id}")
    public ResponseEntity<?> deleteFieldDetail(@PathVariable Integer id) {
        fieldDetailsService.deleteFieldDetail(id);
        return ResponseEntity.ok("Field Details deleted successfully");
    }
}


