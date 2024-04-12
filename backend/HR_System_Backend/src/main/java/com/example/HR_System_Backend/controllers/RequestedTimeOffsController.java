package com.example.HR_System_Backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/requested_time_off")

public class RequestedTimeOffsController {

    @Autowired
    RequestedTimeOffService requestedTimeOffService;

}
