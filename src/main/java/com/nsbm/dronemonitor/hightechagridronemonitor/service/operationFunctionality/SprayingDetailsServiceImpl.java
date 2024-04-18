package com.nsbm.dronemonitor.hightechagridronemonitor.service.operationFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality.SprayingDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality.SprayingDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.operationFunctionality.SprayingDetailsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprayingDetailsServiceImpl implements SprayingDetailsService {

    @Autowired
    private SprayingDetailsRepository sprayingDetailsRepository;

    @Override
    public SprayingDetailsModel createSprayingDetail(SprayingDetailsDto sprayingDetailsDto) {
        SprayingDetailsModel sprayingDetail = new SprayingDetailsModel();
        sprayingDetail.setDroneId(sprayingDetailsDto.getDroneId());
        sprayingDetail.setJobId(sprayingDetailsDto.getJobId());
        sprayingDetail.setCropType(sprayingDetailsDto.getCropType());
        sprayingDetail.setChemicalType(sprayingDetailsDto.getChemicalType());
        sprayingDetail.setSprayingDate(sprayingDetailsDto.getSprayingDate());
        sprayingDetail.setChemicalQuantity(sprayingDetailsDto.getChemicalQuantity());
        sprayingDetail.setVolume(sprayingDetailsDto.getVolume());
        sprayingDetail.setConcentration(sprayingDetailsDto.getConcentration());
        return sprayingDetailsRepository.save(sprayingDetail);
    }

    @Override
    public SprayingDetailsModel getSprayingDetailById(Integer eventId) {
        return sprayingDetailsRepository.findById(eventId)
                .orElseThrow(() -> new EntityNotFoundException("Spraying detail not found with id: " + eventId));
    }

    @Override
    public List<SprayingDetailsModel> getAllSprayingDetails() {
        return sprayingDetailsRepository.findAll();
    }

    @Override
    public SprayingDetailsModel updateSprayingDetail(Integer eventId, SprayingDetailsDto sprayingDetailsDto) {
        SprayingDetailsModel sprayingDetail = getSprayingDetailById(eventId);

        if (sprayingDetailsDto.getDroneId() != null){
            sprayingDetail.setDroneId(sprayingDetailsDto.getDroneId());
        }
        if (sprayingDetailsDto.getJobId() != null) {
            sprayingDetail.setJobId(sprayingDetailsDto.getJobId());
        }
        if (sprayingDetailsDto.getCropType() != null) {
            sprayingDetail.setCropType(sprayingDetailsDto.getCropType());
        }
        if (sprayingDetailsDto.getChemicalType() != null) {
            sprayingDetail.setChemicalType(sprayingDetailsDto.getChemicalType());
        }
        if (sprayingDetailsDto.getSprayingDate() != null) {
            sprayingDetail.setSprayingDate(sprayingDetailsDto.getSprayingDate());
        }
        if (sprayingDetailsDto.getChemicalQuantity() != null) {
            sprayingDetail.setChemicalQuantity(sprayingDetailsDto.getChemicalQuantity());
        }
        if (sprayingDetailsDto.getVolume() != null) {
            sprayingDetail.setVolume(sprayingDetailsDto.getVolume());
        }
        if (sprayingDetailsDto.getConcentration() != null) {
            sprayingDetail.setConcentration(sprayingDetailsDto.getConcentration());
        }

        return sprayingDetailsRepository.save(sprayingDetail);
    }

    @Override
    public void deleteSprayingDetail(Integer eventId) {
        SprayingDetailsModel sprayingDetail = sprayingDetailsRepository.findById(eventId)
                .orElseThrow(() -> new EntityNotFoundException("Spraying detail not found with id: " + eventId));
        sprayingDetailsRepository.delete(sprayingDetail);
    }
}