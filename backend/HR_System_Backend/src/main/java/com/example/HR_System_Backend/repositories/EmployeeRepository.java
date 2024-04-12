package com.example.HR_System_Backend.repositories;

import com.example.HR_System_Backend.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByWorkEmail(String workEmail);
}
