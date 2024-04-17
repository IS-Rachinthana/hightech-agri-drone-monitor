package com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality;

import java.util.Date;

public class ClientInformationDto {
    private String clientName;
    private String contactNumber;
    private String clientEmail;
    private String clientAddress;

    private String clientFiledName;

    public String getClientFiledName() {
        return clientFiledName;
    }

    public void setClientFiledName(String clientFiledName) {
        this.clientFiledName = clientFiledName;
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




}
