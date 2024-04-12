package com.example.HR_System_Backend.models;

import java.time.LocalDate;

public class EmployeeDTO {

    private String firstName;
    private String lastName;
    private String workEmail;
    private String password;
    private int totalHoliday;
    private String sortCode;
    private String accountNumber;
    private int salary;
    private LocalDate employeeStartDate;

    public EmployeeDTO() {}

    public EmployeeDTO(String firstName, String lastName, String workEmail, String password, int totalHoliday,
                       String sortCode, String accountNumber, int salary, LocalDate employeeStartDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.workEmail = workEmail;
        this.password = password;
        this.totalHoliday = totalHoliday;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.salary = salary;
        this.employeeStartDate = employeeStartDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkEmail() {
        return this.workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalHoliday() {
        return this.totalHoliday;
    }

    public void setTotalHoliday(int totalHoliday) {
        this.totalHoliday = totalHoliday;
    }

    public String getSortCode() {
        return this.sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getEmployeeStartDate() {
        return this.employeeStartDate;
    }

    public void setEmployeeStartDate(LocalDate employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

}
