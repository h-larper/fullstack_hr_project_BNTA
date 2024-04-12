package com.example.HR_System_Backend.controllers;

import com.example.HR_System_Backend.models.RequestedTimeOff;
import com.example.HR_System_Backend.services.RequestedTimeOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/requested_time_off")

public class RequestedTimeOffController {

    @Autowired
    RequestedTimeOffService requestedTimeOffService;

    @GetMapping
    public ResponseEntity<List<RequestedTimeOff>> getAllRequestedTimeOffs() {
        return new ResponseEntity<>(requestedTimeOffService.getAllRequestedTimeOffs(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RequestedTimeOff> getRequestedTimeOffById(@PathVariable long id) {
        Optional<RequestedTimeOff> requestedTimeOff = requestedTimeOffService.getRequestedTimeOffById(id);
        if(requestedTimeOff.isPresent()) {
            return new ResponseEntity<>(requestedTimeOff.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<RequestedTimeOff> createRequestedTimeOff (@RequestBody RequestedTimeOff requestedTimeOff) {
        RequestedTimeOff newRequestedTimeOff = requestedTimeOffService.saveRequestedTimeOff(requestedTimeOff);
        return new ResponseEntity<>(newRequestedTimeOff, HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<RequestedTimeOff> updateRequestedTimeOff (@RequestBody RequestedTimeOff requestedTimeOff,
                                                                    @PathVariable long id) {
        Optional<RequestedTimeOff> requestedTimeOff1 = requestedTimeOffService.getRequestedTimeOffById(id);
        if(requestedTimeOff1.isPresent()) {
            return new ResponseEntity<>(requestedTimeOffService.updateRequestedTimeOff(requestedTimeOff, id), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    

}
