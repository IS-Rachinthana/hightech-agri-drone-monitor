package com.nsbm.dronemonitor.hightechagridronemonitor.Job.controller;

import com.nsbm.dronemonitor.hightechagridronemonitor.Job.dto.WeatherConditionDTO;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.model.WeatherCondition;
import com.nsbm.dronemonitor.hightechagridronemonitor.Job.repository.WeatherConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class WeatherConditionController {
    @Autowired
    //WeatherConditionService weatherConditionService;
    private WeatherConditionRepository weatherConditionRepository;

    @PostMapping("/weatherCondition")
    public ResponseEntity<WeatherCondition> save(@RequestBody WeatherConditionDTO weatherConditionDTO) {
        WeatherCondition weatherCondition = convertToEntity(weatherConditionDTO);
        weatherCondition = weatherConditionRepository.save(weatherCondition);
        return new ResponseEntity<>(weatherCondition, HttpStatus.CREATED);
    }

    private WeatherCondition convertToEntity(WeatherConditionDTO dto) {
        WeatherCondition weatherCondition = new WeatherCondition();
        weatherCondition.setWeatherNote(dto.getWeatherNote());
        //Handle the rest of the mapping
        return weatherCondition;
    }

    @GetMapping("/weatherCondition")
    public ResponseEntity<List<WeatherCondition>> getAllWeatherCondition() {
        List<WeatherCondition> weatherConditions = weatherConditionRepository.findAll();
        return ResponseEntity.ok(weatherConditions);
    }

   // @RequestMapping(value = "/hello", method = RequestMethod.GET)
  //  public String greeting() {return "Hello SpringBoot";}

   // @RequestMapping(value = "/hello", method = RequestMethod.POST)
   // public String helloWorld2() { return "My First POST API"; }

   // @RequestMapping(value = "/weatherCondition", method = RequestMethod.POST)
   // public WeatherCondition save(@RequestBody WeatherCondition weatherCondition) {return weatherConditionService.save(weatherCondition);}
}
