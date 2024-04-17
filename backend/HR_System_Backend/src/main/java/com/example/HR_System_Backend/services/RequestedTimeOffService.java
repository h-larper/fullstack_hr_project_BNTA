package com.example.HR_System_Backend.services;

import com.example.HR_System_Backend.models.ApprovalDTO;
import com.example.HR_System_Backend.models.Employee;
import com.example.HR_System_Backend.models.RequestedTimeOff;
import com.example.HR_System_Backend.models.RequestedTimeOffDTO;
import com.example.HR_System_Backend.repositories.RequestedTimeOffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.HR_System_Backend.models.Status.PENDING;

@Service
public class RequestedTimeOffService {

    @Autowired
    RequestedTimeOffRepository requestedTimeOffRepository;

    @Autowired
    EmployeeService employeeService;

    public List<RequestedTimeOff> getAllRequestedTimeOffs(){
        return requestedTimeOffRepository.findAll();
    }

    public Optional<RequestedTimeOff> getRequestedTimeOffById(long id){
        return requestedTimeOffRepository.findById(id);
    }

    public RequestedTimeOff saveRequestedTimeOff(RequestedTimeOffDTO requestedTimeOffDTO) {
        Employee employee = employeeService.getEmployeeById(requestedTimeOffDTO.getEmployeeId()).get();
        RequestedTimeOff newRequestedTimeOff = new RequestedTimeOff(requestedTimeOffDTO.getStartDate(), requestedTimeOffDTO.getEndDate(),
                requestedTimeOffDTO.getTimeOffType(), requestedTimeOffDTO.getNotes(), requestedTimeOffDTO.getStatus(), employee);
        return requestedTimeOffRepository.save(newRequestedTimeOff);
    }

    public RequestedTimeOff updateRequestedTimeOff(RequestedTimeOff requestedTimeOff, long id){
        RequestedTimeOff requestedTimeOffUpdate = requestedTimeOffRepository.findById(id).get();
        requestedTimeOffUpdate.setStartDate(requestedTimeOff.getStartDate());
        requestedTimeOffUpdate.setEndDate(requestedTimeOff.getEndDate());
        requestedTimeOffUpdate.setTimeOffType(requestedTimeOff.getTimeOffType());
        requestedTimeOffUpdate.setNotes(requestedTimeOff.getNotes());
        requestedTimeOffUpdate.setStatus(PENDING);
        requestedTimeOffRepository.save(requestedTimeOffUpdate);
        return requestedTimeOffUpdate;
    }

    public RequestedTimeOff updateApprovalStatus(ApprovalDTO approvalDTO, long id){
        RequestedTimeOff requestedTimeOff = requestedTimeOffRepository.findById(id).get();
        requestedTimeOff.setStatus(approvalDTO.getStatus());
        return requestedTimeOffRepository.save(requestedTimeOff);
    }

    public void deleteRequestedTimeOffById(long id){
        requestedTimeOffRepository.deleteById(id);
    }

    public List<RequestedTimeOff> getTimeOffsByEmployeeId(long id) {
        return requestedTimeOffRepository.findByEmployeeId(id);
    }
}
