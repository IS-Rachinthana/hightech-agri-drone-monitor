package com.nsbm.dronemonitor.hightechagridronemonitor.model.operationFunctionality;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "job_summary")
public class JobSummaryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reportId;
    private String operatorName;

    private Date nextSprayingDate;
    private String issuesFaced;
    private String additionalNotes;
    private String beforeSprayingPicture;
    private String afterSprayingPicture;
    private String recommendations;
    private String addTrRecommendations;

    public String getAddTrRecommendations() {
        return addTrRecommendations;
    }

    public void setAddTrRecommendations(String addTrRecommendations) {
        this.addTrRecommendations = addTrRecommendations;
    }


    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Date getNextSprayingDate() {
        return nextSprayingDate;
    }

    public void setNextSprayingDate(Date nextSprayingDate) {
        this.nextSprayingDate = nextSprayingDate;
    }

    public String getIssuesFaced() {
        return issuesFaced;
    }

    public void setIssuesFaced(String issuesFaced) {
        this.issuesFaced = issuesFaced;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public String getBeforeSprayingPicture() {
        return beforeSprayingPicture;
    }

    public void setBeforeSprayingPicture(String beforeSprayingPicture) {
        this.beforeSprayingPicture = beforeSprayingPicture;
    }

    public String getAfterSprayingPicture() {
        return afterSprayingPicture;
    }

    public void setAfterSprayingPicture(String afterSprayingPicture) {
        this.afterSprayingPicture = afterSprayingPicture;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }
}


