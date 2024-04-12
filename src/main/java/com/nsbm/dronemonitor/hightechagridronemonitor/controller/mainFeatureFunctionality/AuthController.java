package com.nsbm.dronemonitor.hightechagridronemonitor.controller.mainFeatureFunctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.LoginRequestDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality.LoginResponseDto;
import com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality.UserModel;
import com.nsbm.dronemonitor.hightechagridronemonitor.repository.mainFeatureFunctionality.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.nsbm.dronemonitor.hightechagridronemonitor.util.JwtUtil;

@RestController
public class AuthController {

    @Autowired
    private userRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> loginRoute(@RequestBody LoginRequestDto loginRequest) {
        String email = loginRequest.getUserEmail();
        String password = loginRequest.getUserPassword();

        // Retrieve user from the database based on email
        UserModel user = userRepository.findByUserEmail(email);

        // Check if user exists and if the provided password matches the stored password
        if (user != null && passwordEncoder.matches(password, user.getUserPassword())) {
            String token = jwtUtil.generateToken(email);


            return ResponseEntity.ok(new LoginResponseDto("SUCCESS", token));
        } else {
            String message = "FAIL";
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new LoginResponseDto(message));
        }
    }
}
