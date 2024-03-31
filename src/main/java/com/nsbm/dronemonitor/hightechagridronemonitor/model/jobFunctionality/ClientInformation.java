package com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality;

import jakarta.persistence.*;
import jdk.jfr.Label;

@Entity
@Table(name = "client_information")
public class ClientInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientID;
    private String clientName;
    private int contactNumber;
    private String clientEmail;
    private String clientAddress;

    // Getters and Setters
    private int getClientID() { return clientID; }
    public void setClientID(int clientID) { this.clientID = clientID; }
    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }
    public int getContactNumber() { return contactNumber; }
    public void setContactNumber(int contactNumber) { this.contactNumber = contactNumber; }
    public String getClientEmail() { return clientEmail; }
    public void setClientEmail(String clientEmail) { this.clientEmail = clientEmail; }
    public String getClientAddress() { return clientAddress; }
    public void setClientAddress(String clientAddress) { this.clientAddress = clientAddress; }


}
