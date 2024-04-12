package com.example.HR_System_Backend.controllers;

import com.example.HR_System_Backend.models.*;
import com.example.HR_System_Backend.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee>getEmployeeById(@PathVariable Long id){
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (employee.isPresent()){
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO){
        Employee newEmployee = employeeService.saveEmployee(employeeDTO);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<Employee> login(@RequestBody LoginDTO loginDTO){
        try{
            Employee currentUser = employeeService.login(loginDTO);
            return new ResponseEntity<>(currentUser, HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        }
    }

    @PatchMapping(value = "/{id}/updateManager")
    public ResponseEntity<Employee> updateManager(@RequestBody UpdateManagerDTO updateManagerDTO, @PathVariable Long id){
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (!employee.isPresent()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        Optional<Employee> manager = employeeService.getEmployeeById(updateManagerDTO.getManagerId());
        if (!manager.isPresent()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        Employee updatedEmployee = employeeService.updateManager(manager.get(), employee.get());
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Employee> updateProfileDetails(@RequestBody UpdateProfileDetailsDTO updateProfileDetailsDTO,
                                                         @PathVariable Long id){
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (!employee.isPresent()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        Employee updatedEmployee = employeeService.updateProfileDetails(employee.get(), updateProfileDetailsDTO);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteEmployee(@PathVariable Long id){
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (!employee.isPresent()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        Long deletedEmployeeId = employeeService.deleteEmployee(id);
        return new ResponseEntity<>(deletedEmployeeId, HttpStatus.OK);
    }
}
