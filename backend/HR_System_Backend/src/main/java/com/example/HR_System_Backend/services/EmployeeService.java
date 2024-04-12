package com.example.HR_System_Backend.services;

import com.example.HR_System_Backend.models.Employee;
import com.example.HR_System_Backend.models.EmployeeDTO;
import com.example.HR_System_Backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(long id){
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO){
       Employee newEmployee = new Employee(employeeDTO.getFirstName(), employeeDTO.getLastName(), employeeDTO.getWorkEmail(),
               employeeDTO.getPassword(), employeeDTO.getTotalHoliday(), employeeDTO.getSortCode(), employeeDTO.getAccountNumber(),
               employeeDTO.getSalary(), employeeDTO.getEmployeeStartDate());
       employeeRepository.save(newEmployee);
       return newEmployee;
    }


    //       Optional<Employee> manager = employeeRepository.findById(employeeDTO.getManagerId());
//       if (manager.isPresent()){
//
//       }

}
