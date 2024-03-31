package com.nsbm.dronemonitor.hightechagridronemonitor.controller.jobFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.dto.ClientInformationDTO;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.ClientInformation;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository.ClientInformationRepository;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.service.ClientInformationService;
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
public class clientInformationController {
    @Autowired
    //ClientInformationService clientInformationService;
    private ClientInformationRepository clientInformationRepository;

    @PostMapping("/clientInformation")
    public ResponseEntity<ClientInformation> save(@RequestBody ClientInformationDTO clientInformationDTO) {
        ClientInformation clientInformation = convertToEntity(clientInformationDTO);
        clientInformation = clientInformationRepository.save(clientInformation);
        return new ResponseEntity<>(clientInformation, HttpStatus.CREATED);
    }

    private ClientInformation convertToEntity(ClientInformationDTO dto) {
        ClientInformation clientInformation = new ClientInformation();
        clientInformation.setClientName(dto.getName());
        clientInformation.setContactNumber(dto.getNumber());
        clientInformation.setClientEmail(dto.getEmail());
        clientInformation.setClientAddress(dto.getAddress());
        //Handle the rest of the mapping
        return clientInformation;
    }

    @GetMapping("/clientInformation")
    public ResponseEntity<List<ClientInformation>> getAllClientInformation() {
        List<ClientInformation> clientInformation = clientInformationRepository.findAll();
        return ResponseEntity.ok(clientInformation);
    }

   // @RequestMapping(value = "/hello", method = RequestMethod.GET)
   // public String greeting() {return "Hello SpringBoot";}

   // @RequestMapping(value = "/hello", method = RequestMethod.POST)
    //public String helloWorld2() { return "My First POST API"; }

   // @RequestMapping(value = "/clientInformation", method = RequestMethod.POST)
   // public ClientInformation save(@RequestBody ClientInformation clientInformation) {return clientInformationService.save(clientInformation);}
}
