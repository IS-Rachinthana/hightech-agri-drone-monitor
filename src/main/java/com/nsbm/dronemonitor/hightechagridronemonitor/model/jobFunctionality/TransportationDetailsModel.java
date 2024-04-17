package com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.util.Date;


@Entity
@Table(name = "transportation_details")
public class TransportationDetailsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transPortId;
    private String vehicleType;
    private String vehicleNumberPlate;

    private String departureTime;
    private String startTime;
    private String mileage;
    private Date transportDate;
    private String pilotId;



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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Date getTransportDate() {
        return transportDate;
    }

    public void setTransportDate(Date transportDate) {
        this.transportDate = transportDate;
    }

    public String getPilotId() {
        return pilotId;
    }

    public void setPilotId(String pilotId) {
        this.pilotId = pilotId;
    }





}
