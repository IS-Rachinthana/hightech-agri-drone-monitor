package com.nsbm.dronemonitor.hightechagridronemonitor.dto.mainFeatureFunctionality;

public class LoginResponseDto {
    private String message;

    // Constructors
    public LoginResponseDto() {
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
}
