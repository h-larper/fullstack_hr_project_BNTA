package com.example.HR_System_Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "requested_time_offs")
public class RequestedTimeOff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "time_off_type")
    private TimeOffType timeOffType;

    @Column(name = "notes")
    private String notes;

    @Column(name = "status")
    private Status status;

    @JsonIgnoreProperties({"requestedTimeOffs", "manager", "managees"})
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public RequestedTimeOff() {}

    public RequestedTimeOff(LocalDate startDate, LocalDate endDate, TimeOffType timeOffType, String notes, Status status, Employee employee){
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeOffType = timeOffType;
        this.notes = notes;
        this.status = status;
        this.employee = employee;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public TimeOffType getTimeOffType() {
        return this.timeOffType;
    }

    public void setTimeOffType(TimeOffType timeOffType) {
        this.timeOffType = timeOffType;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
