package com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality;
import java.util.Date;

public class SprayingDetailsDto {

    private String droneId;

    public String getDroneId() {
        return droneId;
    }

    public void setDroneId(String droneId) {
        this.droneId = droneId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public String getChemicalType() {
        return chemicalType;
    }

    public void setChemicalType(String chemicalType) {
        this.chemicalType = chemicalType;
    }

    public Date getSprayingDate() {
        return sprayingDate;
    }

    public void setSprayingDate(Date sprayingDate) {
        this.sprayingDate = sprayingDate;
    }

    public String getChemicalQuantity() {
        return chemicalQuantity;
    }

    public void setChemicalQuantity(String chemicalQuantity) {
        this.chemicalQuantity = chemicalQuantity;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    private String jobId;
    private String cropType;
    private String chemicalType;
    private Date sprayingDate;
    private String chemicalQuantity;
    private String volume;
    private String concentration;
}
