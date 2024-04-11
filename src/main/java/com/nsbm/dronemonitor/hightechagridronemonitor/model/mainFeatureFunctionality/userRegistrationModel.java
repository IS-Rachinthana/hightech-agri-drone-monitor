package com.nsbm.dronemonitor.hightechagridronemonitor.model.mainFeatureFunctionality;


import jakarta.persistence.*;

import java.net.PasswordAuthentication;
import java.util.Date;

@Entity
@Table(name = "user_registration")
public class userRegistrationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String userName;


    private String userEmail;

    private String userPassword;

    private String userRole;

    private String userAddress;

    private int userContactNum;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserContactNum() {
        return userContactNum;
    }

    public void setUserContactNum(int userContactNum) {
        this.userContactNum = userContactNum;
    }



}
