package com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.FieldDetailsDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.FieldDetailsModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality.FieldDetailsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldDetailsServiceImpl implements FieldDetailsService {

    @Autowired
    private FieldDetailsRepository fieldDetailsRepository;

    @Override
    public FieldDetailsModel createFieldDetail(FieldDetailsDto fieldDetailsDto) {
        FieldDetailsModel fieldDetail = new FieldDetailsModel();
        fieldDetail.setFieldName(fieldDetailsDto.getFieldName());
        fieldDetail.setFieldSize(fieldDetailsDto.getFieldSize());
        fieldDetail.setArea(fieldDetailsDto.getArea());
        fieldDetail.setClientId(fieldDetailsDto.getClientId());
        fieldDetail.setFieldDescription(fieldDetailsDto.getFieldDescription());
        return fieldDetailsRepository.save(fieldDetail);
    }

    @Override
    public FieldDetailsModel getFieldDetailById(Integer fieldId) {
        return fieldDetailsRepository.findById(fieldId)
                .orElseThrow(() -> new EntityNotFoundException("Field detail not found with id: " + fieldId));
    }

    @Override
    public List<FieldDetailsModel> getAllFieldDetails() {
        return fieldDetailsRepository.findAll();
    }

    @Override
    public FieldDetailsModel updateFieldDetail(Integer fieldId, FieldDetailsDto fieldDetailsDto) {
        FieldDetailsModel fieldDetail = getFieldDetailById(fieldId);

        if (fieldDetailsDto.getFieldName() != null) {
            fieldDetail.setFieldName(fieldDetailsDto.getFieldName());
        }
        if (fieldDetailsDto.getFieldSize() != null) {
            fieldDetail.setFieldSize(fieldDetailsDto.getFieldSize());
        }
        if (fieldDetailsDto.getArea() != null) {
            fieldDetail.setArea(fieldDetailsDto.getArea());
        }
        if (fieldDetailsDto.getClientId() != null) {
            fieldDetail.setClientId(fieldDetailsDto.getClientId());
        }
        if (fieldDetailsDto.getFieldDescription() != null) {
            fieldDetail.setFieldDescription(fieldDetailsDto.getFieldDescription());
        }

        return fieldDetailsRepository.save(fieldDetail);
    }

    @Override
    public void deleteFieldDetail(Integer fieldId) {
        FieldDetailsModel fieldDetail = getFieldDetailById(fieldId);
        if (fieldDetail != null) {
            fieldDetailsRepository.delete(fieldDetail);
        } else {
            throw new EntityNotFoundException("Field detail not found with id: " + fieldId);
        }
    }
}