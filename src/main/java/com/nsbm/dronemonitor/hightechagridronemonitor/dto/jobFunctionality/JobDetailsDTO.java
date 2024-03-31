package com.nsbm.dronemonitor.hightechagridronemonitor.Job.dto;

import java.util.Date;
public class JobDetailsDTO {
    private int jobId;
    private int inventoryId;
    private Date date;
    private int fieldLocation;
    private String companyProjectName;

    // Getters and Setters
    public int getJobId() { return jobId; }

    public void setJobId(int jobId) { this.jobId = jobId; }

    public int getInventoryId() { return inventoryId; }

    public void setInventoryId(int inventoryId) {this.inventoryId = inventoryId; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {this.date = date; }

    public int getFieldLocation() { return fieldLocation; }

    public void setFieldLocation(int fieldLocation) {this.fieldLocation = fieldLocation; }

    public String getCompanyProjectName() { return companyProjectName; }

    public void setCompanyProjectName(String companyProjectName) {this.companyProjectName = companyProjectName; }
}
