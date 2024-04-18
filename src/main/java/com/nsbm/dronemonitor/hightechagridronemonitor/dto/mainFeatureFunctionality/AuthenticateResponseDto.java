package com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality;

public class AuthenticateResponseDto {
    private String message;
    private String token;  // Add token field

    // Constructors
    public AuthenticateResponseDto(String message, String token) {
        this.message = message;
        this.token = token; // Set token
    }

    public AuthenticateResponseDto(String message) {
        this.message = message;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() { // Getter for token
        return token;
    }

    public void setToken(String token) { // Setter for token
        this.token = token;
    }
}
