package com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality;

import java.security.PrivateKey;
import java.util.Date;
public class JobDetailsDTO {
    private int jobId;
    private String inventoryId;
    private Date date;
    private int fieldLocation;
    private String companyProjectName;

    private String jobDescription;

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }



    // Getters and Setters
    public int getJobId() { return jobId; }

    public void setJobId(int jobId) { this.jobId = jobId; }

    public String getInventoryString() { return inventoryId; }

    public void setInventoryId(String inventoryId) {this.inventoryId = inventoryId; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {this.date = date; }

    public int getFieldLocation() { return fieldLocation; }

    public void setFieldLocation(int fieldLocation) {this.fieldLocation = fieldLocation; }

    public String getCompanyProjectName() { return companyProjectName; }

    public void setCompanyProjectName(String companyProjectName) {this.companyProjectName = companyProjectName; }
}
