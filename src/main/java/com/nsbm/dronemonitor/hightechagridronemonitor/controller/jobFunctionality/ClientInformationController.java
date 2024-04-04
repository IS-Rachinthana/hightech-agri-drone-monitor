package com.nsbm.dronemonitor.hightechagridronemonitor.controller.jobFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.ClientInformationDTO;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.ClientInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ClientInformationController {

    @Autowired
    private com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality.ClientInformationRepository clientInformationRepository;

    @PostMapping("/ClientInformation")
    public ResponseEntity<ClientInformation> save(@RequestBody ClientInformationDTO ClientInformationDTO) {
        ClientInformation ClientInformation = convertToEntity(ClientInformationDTO);
        ClientInformation = clientInformationRepository.save(ClientInformation);
        return new ResponseEntity<>(ClientInformation, HttpStatus.CREATED);
    }

    private ClientInformation convertToEntity(ClientInformationDTO dto) {
        ClientInformation ClientInformation = new ClientInformation();
        ClientInformation.setClientName(dto.getClientName());
        ClientInformation.setClientAddress(dto.getClientAddress());
        ClientInformation.setContactNumber(dto.getContactNumber());
        ClientInformation.setClientEmail(dto.getClientEmail());
        // Handle the rest of the mapping
        return ClientInformation;
    }

    @GetMapping("/ClientInformation")
    public ResponseEntity<List<ClientInformation>> getALLClientInformation() {
        List<ClientInformation> ClientInformation=clientInformationRepository.findAll();
        return ResponseEntity.ok(ClientInformation);
    }
}