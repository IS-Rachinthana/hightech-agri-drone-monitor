package com.nsbm.dronemonitor.hightechagridronemonitor.controller;

import com.nsbm.dronemonitor.hightechagridronemonitor.model.DronePilot;
import com.nsbm.dronemonitor.hightechagridronemonitor.service.DronePilotServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


public class DronePilotController {

    @Autowired
    DronePilotServices dronePilotServices;

    //@GetMapping ()
    @RequestMapping(value = "/dronePilots", method = RequestMethod.POST)
    public DronePilot save(@RequestBody DronePilot dronePilot) {return DronePilotServices.save(dronePilot);}


}
