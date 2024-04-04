package com.nsbm.dronemonitor.hightechagridronemonitor.controller.jobFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality.TransportationDTO;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.TransportationDetails;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality.TransportationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;


@RestController
public class TransportationDetailsController {
    @Autowired
   // TransportationDetailsService transportationDetailsService;
    private com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality.TransportationDetailsRepository transportationDetailsRepository;

    @PostMapping("/transportationDetails")
    public ResponseEntity<TransportationDetails> save(@RequestBody TransportationDTO transportationDTO) {
        TransportationDetails transportationDetails = convertToEntity(transportationDTO);
        transportationDetails = transportationDetailsRepository.save(transportationDetails);
        return new ResponseEntity<>(transportationDetails, HttpStatus.CREATED);
    }

    private TransportationDetails convertToEntity(TransportationDTO dto) {
        TransportationDetails transportationDetails = new TransportationDetails();
        transportationDetails.setVehicleType(dto.getVehicleType());
        transportationDetails.setVehicleNumberPlate(dto.getVehicleNumberPlate());
        transportationDetails.setDepartureTime(dto.getDepartureTime());
        transportationDetails.setReturnTime(dto.getReturnTime());
        transportationDetails.setMileage(dto.getMileage());
        //Handle the rest of the mapping
        return transportationDetails;
    }

    @GetMapping("/transportationDetails")
    public ResponseEntity<List<TransportationDetails>> getAllTransportDetails() {
        List<TransportationDetails> transportationDetails = transportationDetailsRepository.findAll();
        return ResponseEntity.ok(transportationDetails);
    }

   // @RequestMapping(value = "/hello", method = RequestMethod.GET)
   // public String greeting() {return "Hello SpringBoot";}

  //  @RequestMapping(value = "/hello", method = RequestMethod.POST)
    //public String helloWorld2() { return "My First POST API"; }

   // @RequestMapping(value = "/transportationDetails", method = RequestMethod.POST)
   // public TransportationDetails save(@RequestBody TransportationDetails transportationDetails) {return transportationDetailsService.save(transportationDetails);}
}
