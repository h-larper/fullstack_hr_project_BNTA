package com.example.HR_System_Backend.components;

import com.example.HR_System_Backend.models.Employee;
import com.example.HR_System_Backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run (ApplicationArguments args) throws Exception{
        //EMPLOYEES
        Employee employee1 = new Employee("Laura", "Harper", "laura@laura.com",
                "cats", Period.ofDays(20), 451269, 12345678, 200,
                LocalDate.of(2023,10,6), null);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Hannah", "Riley", "hannah@hannah.com",
                "dogs", Period.ofDays(200), 123456, 87654321, 200000,
                LocalDate.of(2024,4,10), employee1);
        employeeRepository.save(employee2);

        Employee employee3 = new Employee("Maya", "Tetteh", "maya@maya.com",
                "orcas", Period.ofDays(364), 246810, 12345679, 3000000,
                LocalDate.of(2001,12,25), employee1);
        employeeRepository.save(employee3);

        Employee employee4 = new Employee("Karen", "Yip", "karen.karen@karen.com",
                "flapjack", Period.ofDays(2), 147258, 98745612, 500,
                LocalDate.of(2021,10,25), employee1);
        employeeRepository.save(employee4);

    }
}
