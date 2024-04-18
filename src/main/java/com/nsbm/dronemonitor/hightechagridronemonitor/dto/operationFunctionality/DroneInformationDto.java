package com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality;

import java.util.Date;

public class DroneInformationDto {
    private String droneModel;
    private String operatorName;

    private String operatorContact;

    private String droneCapacity;

    public String getDroneModel() {
        return droneModel;
    }

    public void setDroneModel(String droneModel) {
        this.droneModel = droneModel;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorContact() {
        return operatorContact;
    }

    public void setOperatorContact(String operatorContact) {
        this.operatorContact = operatorContact;
    }

    public String getDroneCapacity() {
        return droneCapacity;
    }

    public void setDroneCapacity(String droneCapacity) {
        this.droneCapacity = droneCapacity;
    }


}
