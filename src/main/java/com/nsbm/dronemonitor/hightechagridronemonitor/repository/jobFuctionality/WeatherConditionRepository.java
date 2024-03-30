package com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.WeatherCondition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherConditionRepository extends JpaRepository<WeatherCondition, Integer> {
    WeatherCondition save(WeatherCondition weatherCondition);

    List<WeatherCondition> findAll();
}
