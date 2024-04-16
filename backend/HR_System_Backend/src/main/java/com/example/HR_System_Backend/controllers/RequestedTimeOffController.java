package com.example.HR_System_Backend.controllers;

import com.example.HR_System_Backend.models.ApprovalDTO;
import com.example.HR_System_Backend.models.Employee;
import com.example.HR_System_Backend.models.RequestedTimeOff;
import com.example.HR_System_Backend.models.RequestedTimeOffDTO;
import com.example.HR_System_Backend.services.EmployeeService;
import com.example.HR_System_Backend.services.RequestedTimeOffService;
import org.apache.coyote.Response;
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

    @Autowired
    EmployeeService employeeService;

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
    public ResponseEntity<RequestedTimeOff> createRequestedTimeOff (@RequestBody RequestedTimeOffDTO requestedTimeOffDTO) {
        Optional<Employee> employee = employeeService.getEmployeeById(requestedTimeOffDTO.getEmployeeId());
        if(!employee.isPresent()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        RequestedTimeOff newRequestedTimeOff = requestedTimeOffService.saveRequestedTimeOff(requestedTimeOffDTO);
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

    @PatchMapping(value = "/{id}")
    public ResponseEntity<RequestedTimeOff> updateApprovalStatus(@RequestBody ApprovalDTO approvalDTO, @PathVariable long id){

        Optional<RequestedTimeOff> requestedTimeOff = requestedTimeOffService.getRequestedTimeOffById(id);
        if(!requestedTimeOff.isPresent()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        RequestedTimeOff editedRequestedTimeOff = requestedTimeOffService.updateApprovalStatus(approvalDTO, id);
        return new ResponseEntity<>(editedRequestedTimeOff, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteRequestedTimeOffById(@PathVariable long id){
        Optional<RequestedTimeOff> requestedTimeOff = requestedTimeOffService.getRequestedTimeOffById(id);
        if(requestedTimeOff.isPresent()) {
            requestedTimeOffService.deleteRequestedTimeOffById(id);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity <List<RequestedTimeOff>> getTimeOffsByEmployeeId(@PathVariable long id){
        List<RequestedTimeOff> allTimeOffsById = requestedTimeOffService.getTimeOffsByEmployeeId(id);
        return new ResponseEntity<>(allTimeOffsById, HttpStatus.OK);
    }

}
