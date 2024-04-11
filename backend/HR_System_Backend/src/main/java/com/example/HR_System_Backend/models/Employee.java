package com.example.HR_System_Backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Entity(name = "employees")
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "work_email")
    private String workEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "total_holiday")
    private Period totalHoliday;

    @Column(name = "sort_code")
    private int sortCode;

    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "salary")
    private int salary;

    @Column(name = "employee_start_date")
    private LocalDate employeeStartDate;

    @Column(name = "active")
    private Boolean active;

    @OneToMany(mappedBy = "employee")
    private List<Employee> managees;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @OneToMany(mappedBy = "employee")
    private List<RequestedTimeOffs> requestedTimeOffs;
}