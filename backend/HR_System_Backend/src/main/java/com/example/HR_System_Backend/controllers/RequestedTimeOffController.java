package com.example.HR_System_Backend.controllers;

import com.example.HR_System_Backend.models.RequestedTimeOff;
import com.example.HR_System_Backend.services.RequestedTimeOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/requested_time_off")

public class RequestedTimeOffController {

    @Autowired
    RequestedTimeOffService requestedTimeOffService;

    @GetMapping
    public ResponseEntity<List<RequestedTimeOff>> getAllRequestedTimeOffs() {
        return new ResponseEntity<>(requestedTimeOffService.getAllRequestedTimeOffs(), HttpStatus.OK);
    }

}
