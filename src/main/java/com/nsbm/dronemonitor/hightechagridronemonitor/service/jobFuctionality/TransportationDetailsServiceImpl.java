package com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.TransportationDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.TransportationDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality.TransportationDetailsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportationDetailsServiceImpl implements TransportationDetailsService {

    @Autowired
    private TransportationDetailsRepository transportationDetailsRepository;

    @Override
    public TransportationDetailsModel createTransportationDetail(TransportationDetailsDto transportationDetailsDto) {
        TransportationDetailsModel transportationDetail = new TransportationDetailsModel();
        transportationDetail.setVehicleType(transportationDetailsDto.getVehicleType());
        transportationDetail.setVehicleNumberPlate(transportationDetailsDto.getVehicleNumberPlate());
        transportationDetail.setDepartureTime(transportationDetailsDto.getDepartureTime());
        transportationDetail.setStartTime(transportationDetailsDto.getStartTime());
        transportationDetail.setMileage(transportationDetailsDto.getMileage());
        transportationDetail.setTransportDate(transportationDetailsDto.getTransportDate());
        transportationDetail.setPilotId(transportationDetailsDto.getPilotId());
        return transportationDetailsRepository.save(transportationDetail);
    }

    @Override
    public TransportationDetailsModel getTransportationDetailById(Integer transPortId) {
        return transportationDetailsRepository.findById(transPortId)
                .orElseThrow(() -> new EntityNotFoundException("Transportation detail not found with id: " + transPortId));
    }

    @Override
    public List<TransportationDetailsModel> getAllTransportationDetails() {
        return transportationDetailsRepository.findAll();
    }

    @Override
    public TransportationDetailsModel updateTransportationDetail(Integer transPortId, TransportationDetailsDto transportationDetailsDto) {
        TransportationDetailsModel transportationDetail = getTransportationDetailById(transPortId);

        if (transportationDetailsDto.getVehicleType() != null) {
            transportationDetail.setVehicleType(transportationDetailsDto.getVehicleType());
        }
        if (transportationDetailsDto.getVehicleNumberPlate() != null) {
            transportationDetail.setVehicleNumberPlate(transportationDetailsDto.getVehicleNumberPlate());
        }
        if (transportationDetailsDto.getDepartureTime() != null) {
            transportationDetail.setDepartureTime(transportationDetailsDto.getDepartureTime());
        }
        if (transportationDetailsDto.getStartTime() != null) {
            transportationDetail.setStartTime(transportationDetailsDto.getStartTime());
        }
        if (transportationDetailsDto.getMileage() != null) {
            transportationDetail.setMileage(transportationDetailsDto.getMileage());
        }
        if (transportationDetailsDto.getTransportDate() != null) {
            transportationDetail.setTransportDate(transportationDetailsDto.getTransportDate());
        }
        if (transportationDetailsDto.getPilotId() != null) {
            transportationDetail.setPilotId(transportationDetailsDto.getPilotId());
        }

        return transportationDetailsRepository.save(transportationDetail);
    }


    @Override
    public void deleteTransportationDetail(Integer transPortId) {
        TransportationDetailsModel transportationDetail = getTransportationDetailById(transPortId);
        if (transportationDetail != null) {
            transportationDetailsRepository.delete(transportationDetail);
        } else {
            throw new EntityNotFoundException("Transportation detail not found with id: " + transPortId);
        }
    }
}