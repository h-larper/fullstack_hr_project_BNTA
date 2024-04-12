package com.example.HR_System_Backend.services;

import com.example.HR_System_Backend.repositories.RequestedTimeOffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestedTimeOffService {

    @Autowired
    RequestedTimeOffRepository requestedTimeOffRepository;

}
