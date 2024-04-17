package com.nsbm.dronemonitor.hightechagridronemonitor.dto.jobFunctionality;

import java.util.Date;
public class JobDetailsDto {
    private String inventoryId;

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Date getJobStartDate() {
        return jobStartDate;
    }

    public void setJobStartDate(Date jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public String getFieldLocation() {
        return fieldLocation;
    }

    public void setFieldLocation(String fieldLocation) {
        this.fieldLocation = fieldLocation;
    }

    public String getCompanyProjectName() {
        return companyProjectName;
    }

    public void setCompanyProjectName(String companyProjectName) {
        this.companyProjectName = companyProjectName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    private Date jobStartDate;
    private String fieldLocation;
    private String companyProjectName;
    private String fieldType;
    private String jobDescription;


}
