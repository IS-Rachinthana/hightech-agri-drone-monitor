package com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.FieldDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.FieldDetailsModel;

import java.util.List;

public interface FieldDetailsService {
    FieldDetailsModel createFieldDetail(FieldDetailsDto fieldDetailsDto);
    FieldDetailsModel getFieldDetailById(Integer fieldId);
    List<FieldDetailsModel> getAllFieldDetails();
    FieldDetailsModel updateFieldDetail(Integer fieldId, FieldDetailsDto fieldDetailsDto);
    void deleteFieldDetail(Integer fieldId);
}