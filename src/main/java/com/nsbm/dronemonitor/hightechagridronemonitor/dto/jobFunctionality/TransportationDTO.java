package com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality;
import java.util.Date;


public class TransportationDTO {
    private String vehicleType;
    private String vehicleNumberPlate;
    private Date departureTime;
    private Date returnTime;
    private String mileage;

    // Getters and Setters
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

    public void setDepartureTime(Date departureTime) { this.departureTime = departureTime; }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) { this.mileage = mileage; }
}
