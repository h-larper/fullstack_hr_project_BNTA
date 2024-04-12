package com.example.HR_System_Backend.components;

import com.example.HR_System_Backend.models.Employee;
import com.example.HR_System_Backend.models.RequestedTimeOff;
import com.example.HR_System_Backend.models.Type;
import com.example.HR_System_Backend.repositories.EmployeeRepository;
import com.example.HR_System_Backend.repositories.RequestedTimeOffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestScope;

import java.time.LocalDate;
import java.time.Period;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RequestedTimeOffRepository requestedTimeOffRepository;

    @Override
    public void run (ApplicationArguments args) throws Exception{
        //EMPLOYEES

        //Managers
        Employee employee1 = new Employee("Lily", "Bobilly", "lily@lily.com",
                "humanssuck", 0, 000000, 88888888, 200000000,
                LocalDate.of(2023,10,6));
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Laura", "Harper", "laura@lily.com",
                "cats", 20, 451269, 12345678, 2,
                LocalDate.of(2023,10,6));
        employeeRepository.save(employee2);
        employee2.setManager(employee1);
        employeeRepository.save(employee2);

        //Managees
        Employee employee3 = new Employee("Hannah", "Riley", "hannah@lily.com",
                "dogs", 200, 123456, 87654321, 600000,
                LocalDate.of(2024,4,10));
        //Save employee so it gets an id
        employeeRepository.save(employee3);
        //Sets the manager to that id
        employee3.setManager(employee2);
        //Update the employee
        employeeRepository.save(employee3);

        Employee employee4 = new Employee("Maya", "Tetteh", "maya@lily.com",
                "orcas", 364, 246810, 12345679, 3000000,
                LocalDate.of(2001,12,25));
        employeeRepository.save(employee4);
        employee4.setManager(employee2);
        employeeRepository.save(employee4);

        Employee employee5 = new Employee("Karen", "Yip", "karen.karen@lily.com",
                "flapjack", 2, 147258, 98745612, 500,
                LocalDate.of(2021,10,25));
        employeeRepository.save(employee5);
        employee5.setManager(employee2);
        employeeRepository.save(employee5);

        //REQUESTED TIME OFFS

        RequestedTimeOff requestedTimeOff1 = new RequestedTimeOff(LocalDate.of(2024,04,01),
                LocalDate.of(2024,04, 8), Type.HOLIDAYLEAVE, "Need a break!!!!!",
                employee5);
        requestedTimeOffRepository.save(requestedTimeOff1);

        RequestedTimeOff requestedTimeOff2 = new RequestedTimeOff(LocalDate.of(2024,04,01),
                LocalDate.of(2024,04, 2), Type.PARENTALLEAVE, "Think of the children!",
                employee4);
        requestedTimeOffRepository.save(requestedTimeOff2);

        RequestedTimeOff requestedTimeOff3 = new RequestedTimeOff(LocalDate.of(2025,06,13),
                LocalDate.of(2025,06, 27), Type.HOLIDAYLEAVE, "Off to Portugal - " +
                "tchau tá logo", employee3);
        requestedTimeOffRepository.save(requestedTimeOff3);

        RequestedTimeOff requestedTimeOff4 = new RequestedTimeOff(LocalDate.of(2024,04,22),
                LocalDate.of(2024,04, 22), Type.COMPASSIONATELEAVE,
                "Partner cycled into a car door, in A&E",
                employee4);
        requestedTimeOffRepository.save(requestedTimeOff4);

        RequestedTimeOff requestedTimeOff5 = new RequestedTimeOff(LocalDate.of(2024,05,07),
                LocalDate.of(2024,05, 17), Type.HOLIDAYLEAVE, "Visiting Madeira - " +
                "I hope it tastes as good as the cake", employee2);
        requestedTimeOffRepository.save(requestedTimeOff5);

        RequestedTimeOff requestedTimeOff6 = new RequestedTimeOff(LocalDate.of(2024,04,19),
                LocalDate.of(2024,04, 20), Type.SICKLEAVE, "Got the runs", employee5);
        requestedTimeOffRepository.save(requestedTimeOff6);

        RequestedTimeOff requestedTimeOff7 = new RequestedTimeOff(LocalDate.of(2024,04,16),
                LocalDate.of(2024,04, 17), Type.SICKLEAVE,
                "My feline overlord blessed me with a bite - GP appointment", employee2);
        requestedTimeOffRepository.save(requestedTimeOff7);
    }
}
