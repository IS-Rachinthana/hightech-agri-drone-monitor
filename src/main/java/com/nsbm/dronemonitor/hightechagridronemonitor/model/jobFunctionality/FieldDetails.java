package com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality;

import jakarta.persistence.*;
import jdk.jfr.Label;

@Entity
@Table(name = "field_details")
public class FieldDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String paddyFieldSize;
    private int area;

    // Getters and Setters
    public String getPaddyFieldSize() { return paddyFieldSize; }

    public void setPaddyFieldSize(String paddyFieldSize) { this.paddyFieldSize = paddyFieldSize; }

    public int getArea() { return area; }

    public void setArea(int area) { this.area = area; }
}
