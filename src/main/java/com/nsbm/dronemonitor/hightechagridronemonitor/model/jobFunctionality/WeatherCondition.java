package com.nsbm.dronemonitor.hightechagridronemonitor.Job.model;

import jakarta.persistence.*;
import jdk.jfr.Label;

@Entity
@Table(name = "weather_details")
public class WeatherCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String weatherNote;

    // Getters and Setters
    public String getWeatherNote() { return weatherNote;
    }
    public void setWeatherNote(String weatherNote) {
        this.weatherNote = weatherNote;
    }
}
