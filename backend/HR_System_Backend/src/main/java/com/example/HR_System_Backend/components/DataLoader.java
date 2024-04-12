package com.example.HR_System_Backend.components;

import com.example.HR_System_Backend.models.Employee;
import com.example.HR_System_Backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run (ApplicationArguments args) throws Exception{

        //EMPLOYEES

        //Managers
        Employee employee1 = new Employee("Lily", "Bobilly", "lily@lily.com",
                "humanssuck", 365, "000000", "88888888", 20,
                LocalDate.of(2023,10,6));
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Laura", "Harper", "laura@laura.com",
                "cats", 20, "451269", "12345678", 200,
                LocalDate.of(2023,10,6));
        employeeRepository.save(employee2);
        employee2.setManager(employee1);
        employeeRepository.save(employee2);

        //Managees
        Employee employee3 = new Employee("Hannah", "Riley", "hannah@hannah.com",
                "dogs", 200, "123456", "87654321", 200000,
                LocalDate.of(2024,4,10));
        //Save employee so it gets an id
        employeeRepository.save(employee3);
        //Sets the manager to that id
        employee3.setManager(employee2);
        //Update the employee
        employeeRepository.save(employee3);

        Employee employee4 = new Employee("Maya", "Tetteh", "maya@maya.com",
                "orcas", 364, "246810", "12345679", 3000000,
                LocalDate.of(2001,12,25));
        employeeRepository.save(employee4);
        employee4.setManager(employee2);
        employeeRepository.save(employee4);

        Employee employee5 = new Employee("Karen", "Yip", "karen.karen@karen.com",
                "flapjack", 2, "147258", "98745612", 500,
                LocalDate.of(2021,10,25));
        employeeRepository.save(employee5);
        employee5.setManager(employee2);
        employeeRepository.save(employee5);

    }
}
