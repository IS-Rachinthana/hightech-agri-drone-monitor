package com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality;

public class LoginResponseDto {
    private String message;
    private String token; // Add token field

    // Constructors
    public LoginResponseDto(String message, String token) {
        this.message = message;
        this.token = token;
    }

    public LoginResponseDto(String message) {
        this.message = message;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
