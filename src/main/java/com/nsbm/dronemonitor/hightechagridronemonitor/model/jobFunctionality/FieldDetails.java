package com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality;

import jakarta.persistence.*;
import jdk.jfr.Label;

@Entity
@Table(name = "field_details")
public class FieldDetails {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int fieldId;

    private String fieldName;
    private String fieldSize;
    private String area;

    private int clientId;

    private int fieldDescription;

    public int getFieldDescription() {
        return fieldDescription;
    }

    public void setFieldDescription(int fieldDescription) {
        this.fieldDescription = fieldDescription;
    }



    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(String fieldSize) {
        this.fieldSize = fieldSize;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }





}
