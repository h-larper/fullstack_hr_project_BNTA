package com.example.HR_System_Backend.components;

import com.example.HR_System_Backend.models.Employee;
import com.example.HR_System_Backend.models.RequestedTimeOff;
import com.example.HR_System_Backend.models.Status;
import com.example.HR_System_Backend.models.TimeOffType;
import com.example.HR_System_Backend.repositories.EmployeeRepository;
import com.example.HR_System_Backend.repositories.RequestedTimeOffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
                "humanssuck", 365, "000000", "88888888", 20,
                LocalDate.of(2023,10,6));
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Laura", "Harper", "laura@lily.com",
                "cats", 20, "451269", "12345678", 200,
                LocalDate.of(2023,10,6));
        employeeRepository.save(employee2);
        employee2.setManager(employee1);
        employeeRepository.save(employee2);

        //Managees
        Employee employee3 = new Employee("Hannah", "Riley", "hannah@lily.com",
                "dogs", 200, "123456", "87654321", 200000,
                LocalDate.of(2024,4,10));
        //Save employee so it gets an id
        employeeRepository.save(employee3);
        //Sets the manager to that id
        employee3.setManager(employee2);
        //Update the employee
        employeeRepository.save(employee3);

        Employee employee4 = new Employee("Maya", "Tetteh", "maya@lily.com",
                "orcas", 364, "246810", "12345679", 3000000,
                LocalDate.of(2001,12,25));
        employeeRepository.save(employee4);
        employee4.setManager(employee2);
        employeeRepository.save(employee4);

        Employee employee5 = new Employee("Karen", "Yip", "karen.karen@lily.com",
                "flapjack", 20, "147258", "98745612", 500,
                LocalDate.of(2021,10,25));
        employeeRepository.save(employee5);
        employee5.setManager(employee2);
        employeeRepository.save(employee5);

        //REQUESTED TIME OFFS

        RequestedTimeOff requestedTimeOff1 = new RequestedTimeOff(LocalDate.of(2024,04,01),
                LocalDate.of(2024,04, 8), TimeOffType.HOLIDAYLEAVE,
                "Going back to the motherland for some dumplings", Status.PENDING,
                employee5);
        requestedTimeOffRepository.save(requestedTimeOff1);

        RequestedTimeOff requestedTimeOff2 = new RequestedTimeOff(LocalDate.of(2024,04,02),
                LocalDate.of(2024,04, 03), TimeOffType.PARENTALLEAVE, "Think of the children!", Status.PENDING,
                employee4);
        requestedTimeOffRepository.save(requestedTimeOff2);

        RequestedTimeOff requestedTimeOff3 = new RequestedTimeOff(LocalDate.of(2025,06,13),
                LocalDate.of(2025,06, 27), TimeOffType.HOLIDAYLEAVE, "Off to Portugal - " +
                "tchau tá logo", Status.PENDING, employee3);
        requestedTimeOffRepository.save(requestedTimeOff3);

        RequestedTimeOff requestedTimeOff4 = new RequestedTimeOff(LocalDate.of(2024,04,19),
                LocalDate.of(2024,04, 22), TimeOffType.COMPASSIONATELEAVE,
                "Partner cycled into a car door, in A&E", Status.PENDING,
                employee4);
        requestedTimeOffRepository.save(requestedTimeOff4);

        RequestedTimeOff requestedTimeOff5 = new RequestedTimeOff(LocalDate.of(2024,05,07),
                LocalDate.of(2024,05, 17), TimeOffType.HOLIDAYLEAVE, "Visiting Madeira - " +
                "I hope it tastes as good as the cake", Status.PENDING, employee2);
        requestedTimeOffRepository.save(requestedTimeOff5);

        RequestedTimeOff requestedTimeOff6 = new RequestedTimeOff(LocalDate.of(2024,04,19),
                LocalDate.of(2024,04, 19), TimeOffType.SICKLEAVE, "Got the runs", Status.PENDING, employee5);
        requestedTimeOffRepository.save(requestedTimeOff6);

        RequestedTimeOff requestedTimeOff7 = new RequestedTimeOff(LocalDate.of(2024,04,16),
                LocalDate.of(2024,04, 16), TimeOffType.SICKLEAVE,
                "My feline overlord blessed me with a bite - GP appointment", Status.PENDING, employee2);
        requestedTimeOffRepository.save(requestedTimeOff7);
    }
}
