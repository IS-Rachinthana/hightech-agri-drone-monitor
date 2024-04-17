package com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality;

import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "client_information")
public class ClientInformationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientID;

    private String clientName;

    private String clientEmail;
    private String contactNumber;

    private String clientAddress;

    private String clientFiledName;

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientFiledName() {
        return clientFiledName;
    }

    public void setClientFiledName(String clientFiledName) {
        this.clientFiledName = clientFiledName;
    }





    // Getters and Setters


}
