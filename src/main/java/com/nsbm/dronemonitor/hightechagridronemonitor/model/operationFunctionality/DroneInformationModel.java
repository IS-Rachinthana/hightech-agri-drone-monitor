package com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "drone_info")
public class DroneInformationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int droneId;
    private String droneModel;

    private String operatorName;

    private String operatorContact;

    private String droneCapacity;


    public int getDroneId() {
        return droneId;
    }

    public void setDroneId(int droneId) {
        this.droneId = droneId;
    }

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
