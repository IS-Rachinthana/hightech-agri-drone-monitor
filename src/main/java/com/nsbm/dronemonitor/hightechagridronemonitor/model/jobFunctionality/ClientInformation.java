package com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality;

import jakarta.persistence.*;
import jdk.jfr.Label;

@Entity
@Table(name = "client_information")
public class ClientInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientID;

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

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
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

    private String clientName;
    private int contactNumber;
    private String clientEmail;
    private String clientAddress;

    private String clientFiledName;



    // Getters and Setters


}
