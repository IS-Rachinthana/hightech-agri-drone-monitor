package com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality;


public class FlightInformationDto {


    private String droneID;
    private String flightStartTime;

    private String flightEndTime;

    private String totalFlightDuration;

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
