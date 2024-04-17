package com.nsbm.dronemonitor.hightechagridronemonitor.service.jobFuctionality;


import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.ClientInformationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.ClientInformationModel;

import java.util.List;

public interface ClientInformationService {
    ClientInformationModel createClient(ClientInformationDto clientInformationDto);
    ClientInformationModel getClientById(Integer id);
    List<ClientInformationModel> getAllClients();
    ClientInformationModel updateClient(Integer id, ClientInformationDto clientInformationDto);
    void deleteClient(Integer id);
}
