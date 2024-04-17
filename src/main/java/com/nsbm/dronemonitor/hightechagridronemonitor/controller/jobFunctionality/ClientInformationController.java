package com.nsbm.dronemonitor.hightechagridronemonitor.controller.jobFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.ClientInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.ClientInformationModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality.ClientInformationRepository;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality.ClientInformationService;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality.ClientInformationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/clientInformation")
public class ClientInformationController {

    @Autowired
    private ClientInformationService clientInformationService;

    @PostMapping ("/clientInformation")
    public ResponseEntity<ClientInformationModel> createClient(@RequestBody ClientInformationDto clientInformationDto) {
        ClientInformationModel newClient = clientInformationService.createClient(clientInformationDto);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

    @GetMapping("/clientInformation/{id}")
    public ResponseEntity<ClientInformationModel> getClient(@PathVariable Integer id) {
        ClientInformationModel client = clientInformationService.getClientById(id);
        return ResponseEntity.ok(client);
    }

    @GetMapping("/clientInformation")
    public ResponseEntity<List<ClientInformationModel>> getAllClients() {
        List<ClientInformationModel> clients = clientInformationService.getAllClients();
        return ResponseEntity.ok(clients);
    }

    @PutMapping("/clientInformation/{id}")
    public ResponseEntity<ClientInformationModel> updateClient(@PathVariable Integer id, @RequestBody ClientInformationDto clientInformationDto) {
        ClientInformationModel updatedClient = clientInformationService.updateClient(id, clientInformationDto);
        return ResponseEntity.ok(updatedClient);
    }

    @DeleteMapping("/clientInformation/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable Integer id) {
        clientInformationService.deleteClient(id);
        return ResponseEntity.ok("Client deleted successfully");
    }
}