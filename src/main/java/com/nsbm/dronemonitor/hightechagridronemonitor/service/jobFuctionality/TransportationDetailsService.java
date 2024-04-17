package com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.TransportationDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.TransportationDetailsDto;

import java.util.List;

public interface TransportationDetailsService {
    TransportationDetailsModel createTransportationDetail(TransportationDetailsDto transportationDetailsDto);
    TransportationDetailsModel getTransportationDetailById(Integer transPortId);
    List<TransportationDetailsModel> getAllTransportationDetails();
    TransportationDetailsModel updateTransportationDetail(Integer transPortId, TransportationDetailsDto transportationDetailsDto);
    void deleteTransportationDetail(Integer transPortId);
}