package com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality;

import jakarta.persistence.*;
import jdk.jfr.Label;
import java.util.Date;

@Entity
@Table(name = "transportation_details")
public class TransportationDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transPortId;
    private String vehicleType;
    private String vehicleNumberPlate;

    private Date departureTime;
    private Date startTime;
    private String mileage;
    private int pilotId;

    public int getTransPortId() {
        return transPortId;
    }

    public void setTransPortId(int transPortId) {
        this.transPortId = transPortId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumberPlate() {
        return vehicleNumberPlate;
    }

    public void setVehicleNumberPlate(String vehicleNumberPlate) {
        this.vehicleNumberPlate = vehicleNumberPlate;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getstartTime() {
        return startTime;
    }

    public void setstartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public int getPilotId() {
        return pilotId;
    }

    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }



}
