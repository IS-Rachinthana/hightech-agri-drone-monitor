package com.nsbm.dronemonitor.hightechagridronemonitor.controller.mainFeatureFunctionality;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.UserRegistrationModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.UserRegistrationDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality.UserRegistrationRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RestController
public class UserRegistrationController {

    @Autowired
    private UserRegistrationRepository userRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/registration")
    public ResponseEntity<UserRegistrationModel> registerUser(@RequestBody UserRegistrationDto userDto) {
        UserRegistrationModel user = convertToEntity(userDto);
        user = userRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    private UserRegistrationModel convertToEntity(UserRegistrationDto dto) {
        UserRegistrationModel user = new UserRegistrationModel();
        user.setUserName(dto.getUserName());
        user.setUserEmail(dto.getUserEmail());
        user.setUserPassword(bCryptPasswordEncoder.encode(dto.getUserPassword())); // Encrypt the password
        user.setUserRole(dto.getUserRole());
        user.setUserAddress(dto.getUserAddress());
        user.setUserContactNum(dto.getUserContactNum());
        return user;
    }
}
