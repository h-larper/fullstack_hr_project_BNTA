package com.example.HR_System_Backend.services;

import com.example.HR_System_Backend.models.RequestedTimeOff;
import com.example.HR_System_Backend.repositories.RequestedTimeOffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestedTimeOffService {

    @Autowired
    RequestedTimeOffRepository requestedTimeOffRepository;

    public List<RequestedTimeOff> getAllRequestedTimeOffs(){
        return requestedTimeOffRepository.findAll();
    }

}
