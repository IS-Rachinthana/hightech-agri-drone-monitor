package com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.SprayingDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.SprayingDetailsModel;

import java.util.List;

public interface SprayingDetailsService {
    SprayingDetailsModel createSprayingDetail(SprayingDetailsDto sprayingDetailsDto);
    SprayingDetailsModel getSprayingDetailById(Integer eventId);
    List<SprayingDetailsModel> getAllSprayingDetails();
    SprayingDetailsModel updateSprayingDetail(Integer eventId, SprayingDetailsDto sprayingDetailsDto);
    void deleteSprayingDetail(Integer eventId);
}