package com.example.HR_System_Backend.services;

import com.example.HR_System_Backend.models.*;
import com.example.HR_System_Backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.example.HR_System_Backend.models.Status.PENDING;

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

    public List<HolidayApprovalDTO> getHolidayApprovals(long id){
        List<Employee> managees = employeeRepository.findById(id).get().getManagees();
        List<HolidayApprovalDTO> holidayApprovals = new ArrayList<>();

        //loop through managees
        for(Employee managee : managees){
            //loop through rtos
            for(RequestedTimeOff requestedTimeOff : managee.getRequestedTimeOffs()){
                //check for pending
                if(requestedTimeOff.getStatus() == PENDING){
                    //create DTO and append
                    HolidayApprovalDTO holidayApproval = new HolidayApprovalDTO(requestedTimeOff.getId(),
                            requestedTimeOff.getStartDate(), requestedTimeOff.getEndDate(), requestedTimeOff.getTimeOffType(),
                            requestedTimeOff.getNotes(), managee.getFirstName() + " " + managee.getLastName());
                    holidayApprovals.add(holidayApproval);
                }
            }
        }
        return holidayApprovals;
    }

    public List<CalendarEvent> getCalendarEvents(Long id){
        Employee manager = employeeRepository.findById(id).get();
        List<Employee> managees = manager.getManagees();

        List<CalendarEvent> calendarEvents = new ArrayList<>();
        for(RequestedTimeOff requestedTimeOff : manager.getRequestedTimeOffs()){
            calendarEvents.add(new CalendarEvent(requestedTimeOff.getId(), requestedTimeOff.getStartDate(), requestedTimeOff.getEndDate(),
                    requestedTimeOff.getTimeOffType(), requestedTimeOff.getStatus(), requestedTimeOff.getNotes(),
                    manager.getFirstName() + " " + manager.getLastName(), true));
        }
        for(Employee managee : managees) {
            for (RequestedTimeOff requestedTimeOff : managee.getRequestedTimeOffs()) {
                calendarEvents.add(new CalendarEvent(requestedTimeOff.getId(), requestedTimeOff.getStartDate(), requestedTimeOff.getEndDate(),
                        requestedTimeOff.getTimeOffType(), requestedTimeOff.getStatus(), requestedTimeOff.getNotes(),
                        managee.getFirstName() + " " + managee.getLastName(), false));
            }
        }
        return calendarEvents;
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO){
       Employee newEmployee = new Employee(employeeDTO.getFirstName(), employeeDTO.getLastName(), employeeDTO.getWorkEmail(),
               employeeDTO.getPassword(), employeeDTO.getTotalHoliday(), employeeDTO.getSortCode(), employeeDTO.getAccountNumber(),
               employeeDTO.getSalary(), employeeDTO.getEmployeeStartDate());
       employeeRepository.save(newEmployee);
       return newEmployee;
    }

    public Employee login(LoginDTO loginDTO) throws Exception{
        Optional<Employee> employee = employeeRepository.findByWorkEmail(loginDTO.getWorkEmail());
        if(!employee.isPresent()){
            throw new Exception("Work email address doesn't exist");
        }
        if(employee.get().getPassword().equals(loginDTO.getPassword())){
            return employee.get();
        }
        throw new Exception("Incorrect password");
    }

    public Employee updateManager(Employee manager, Employee employee){
        employee.setManager(manager);
        employeeRepository.save(employee);
        return employee;
    }

    public Employee updateProfileDetails(Employee employee, UpdateProfileDetailsDTO updateProfileDetailsDTO){
        employee.setSortCode(updateProfileDetailsDTO.getSortCode());
        employee.setAccountNumber(updateProfileDetailsDTO.getAccountNumber());
        employeeRepository.save(employee);
        return employee;
    }

    public Long deleteEmployee(Long employeeId){
        Employee employee = employeeRepository.findById(employeeId).get();
        List<Employee> managees = employee.getManagees();
        for(Employee managee : managees){
            managee.setManager(null);
            employeeRepository.save(managee);
        }
        employeeRepository.deleteById(employeeId);
        return employeeId;
    }
}
