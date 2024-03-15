package com.nsbm.dronemonitor.hightechagridronemonitor.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "drone_pilot")
public class DronePilot {


    @Id
    private int pilotId;
    private String pilotName;

    private String pilotAddress;

    private String pilotTel;

    private Date pilotDob;


    public int getPilotId() {
        return pilotId;
    }

    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getPilotAddress() {
        return pilotAddress;
    }

    public void setPilotAddress(String pilotAddress) {
        this.pilotAddress = pilotAddress;
    }

    public String getPilotTel() {
        return pilotTel;
    }

    public void setPilotTel(String pilotTel) {
        this.pilotTel = pilotTel;
    }

    public Date getPilotDob() {
        return pilotDob;
    }

    public void setPilotDob(Date pilotDob) {
        this.pilotDob = pilotDob;
    }







}
