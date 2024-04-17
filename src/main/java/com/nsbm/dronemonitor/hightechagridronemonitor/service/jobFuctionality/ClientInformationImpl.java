package com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.ClientInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.ClientInformationModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality.ClientInformationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientInformationImpl implements ClientInformationService {

    @Autowired
    private ClientInformationRepository clientInformationRepository;

    @Override
    public ClientInformationModel createClient(ClientInformationDto clientInformationDto) {
        ClientInformationModel client = new ClientInformationModel();

        client.setClientName(clientInformationDto.getClientName());
        client.setClientEmail(clientInformationDto.getClientEmail());
        client.setContactNumber(clientInformationDto.getContactNumber());
        client.setClientAddress(clientInformationDto.getClientAddress());
        client.setClientFiledName(clientInformationDto.getClientFiledName());

        return clientInformationRepository.save(client);
    }

    @Override
    public ClientInformationModel getClientById(Integer id) {
        return clientInformationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id: " + id));
    }

    @Override
    public List<ClientInformationModel> getAllClients() {
        return clientInformationRepository.findAll();
    }

    @Override
    public ClientInformationModel updateClient(Integer id, ClientInformationDto clientInformationDto) {
        ClientInformationModel client = getClientById(id);

        if (clientInformationDto.getClientName() != null) {
            client.setClientName(clientInformationDto.getClientName());
        }
        if (clientInformationDto.getClientEmail() != null) {
            client.setClientEmail(clientInformationDto.getClientEmail());
        }
        if (clientInformationDto.getContactNumber() != null) {
            client.setContactNumber(clientInformationDto.getContactNumber());
        }
        if (clientInformationDto.getClientAddress() != null) {
            client.setClientAddress(clientInformationDto.getClientAddress());
        }
        if (clientInformationDto.getClientFiledName() != null) {
            client.setClientFiledName(clientInformationDto.getClientFiledName());
        }

        return clientInformationRepository.save(client);
    }

    @Override
    public void deleteClient(Integer id) {
        if (!clientInformationRepository.existsById(id)) {
            throw new EntityNotFoundException("Client not found with id: " + id);
        }
        clientInformationRepository.deleteById(id);
    }
}
