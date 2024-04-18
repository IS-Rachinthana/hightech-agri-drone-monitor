package com.nsbm.dronemonitor.hightechagridronemonitor.dto.operationFunctionality;
import java.util.Date;

public class JobSummaryDto {

    private String operatorName;

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

    public String getAddTrRecommendations() {
        return addTrRecommendations;
    }

    public void setAddTrRecommendations(String addTrRecommendations) {
        this.addTrRecommendations = addTrRecommendations;
    }

    private Date nextSprayingDate;
    private String issuesFaced;
    private String additionalNotes;
    private String beforeSprayingPicture;
    private String afterSprayingPicture;
    private String recommendations;
    private String addTrRecommendations;
}
