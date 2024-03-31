package com.nsbm.dronemonitor.hightechagridronemonitor.controller.mainFeatureFunctionality;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.userRegistrationModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.userRegistrationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality.userRegistrationRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RestController
public class userRegistrationController {

    @Autowired
    private userRegistrationRepository userRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/registration")
    public ResponseEntity<userRegistrationModel> registerUser(@RequestBody userRegistrationDto userDto) {
        userRegistrationModel user = convertToEntity(userDto);
        user = userRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    private userRegistrationModel convertToEntity(userRegistrationDto dto) {
        userRegistrationModel user = new userRegistrationModel();
        user.setUserName(dto.getUserName());
        user.setUserEmail(dto.getUserEmail());
        user.setUserPassword(bCryptPasswordEncoder.encode(dto.getUserPassword())); // Encrypt the password
        user.setUserRole(dto.getUserRole());
        user.setUserAddress(dto.getUserAddress());
        user.setUserContactNum(dto.getUserContactNum());
        return user;
    }
}
