package com.nsbm.dronemonitor.hightechagridronemonitor.repository.jobFuctionality;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.jobFunctionality.WeatherCondition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherConditionRepository extends JpaRepository<WeatherCondition, Integer> {
}
