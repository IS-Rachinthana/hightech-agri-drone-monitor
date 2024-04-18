package com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "flight_info")

public class FlightInformationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;

    private String droneID;

    private String flightStartTime;

    private String flightEndTime;

    private String totalFlightDuration;


    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getDroneID() {
        return droneID;
    }

    public void setDroneID(String droneID) {
        this.droneID = droneID;
    }

    public String getFlightStartTime() {
        return flightStartTime;
    }

    public void setFlightStartTime(String flightStartTime) {
        this.flightStartTime = flightStartTime;
    }

    public String getFlightEndTime() {
        return flightEndTime;
    }

    public void setFlightEndTime(String flightEndTime) {
        this.flightEndTime = flightEndTime;
    }

    public String getTotalFlightDuration() {
        return totalFlightDuration;
    }

    public void setTotalFlightDuration(String totalFlightDuration) {
        this.totalFlightDuration = totalFlightDuration;
    }


}
