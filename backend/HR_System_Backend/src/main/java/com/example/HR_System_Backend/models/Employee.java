package com.example.HR_System_Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
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
    private int totalHoliday;

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

    @JsonIgnoreProperties({"manager"})
    @OneToMany(mappedBy = "manager")
    private List<Employee> managees;

    @JsonIgnoreProperties({"managees"})
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @JsonIgnoreProperties({"employee"})
    @OneToMany(mappedBy = "employee")
    private List<RequestedTimeOff> requestedTimeOffs;

    public Employee() {}

    public Employee(String firstName, String lastName, String workEmail, String password, int totalHoliday,
                    int sortCode, int accountNumber, int salary, LocalDate employeeStartDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workEmail = workEmail;
        this.password = password;
        this.totalHoliday = totalHoliday;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.salary = salary;
        this.employeeStartDate = employeeStartDate;
        this.active = true;
        this.managees = new ArrayList<>();
        this.manager = null;
        this.requestedTimeOffs = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalHoliday() {
        return totalHoliday;
    }

    public void setTotalHoliday(int totalHoliday) {
        this.totalHoliday = totalHoliday;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(LocalDate employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Employee> getManagees() {
        return managees;
    }

    public void setManagees(List<Employee> managees) {
        this.managees = managees;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public List<RequestedTimeOff> getRequestedTimeOffs() {
        return requestedTimeOffs;
    }

    public void setRequestedTimeOffs(List<RequestedTimeOff> requestedTimeOffs) {
        this.requestedTimeOffs = requestedTimeOffs;
    }
}