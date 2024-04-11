package com.example.HR_System_Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "requested_time_off")
public class RequestedTimeOff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "type")
    private Type type;

    @Column(name = "notes")
    private String notes;

    @Column(name = "approved")
    private Boolean approved;

    @JsonIgnoreProperties({"requested_time_off"})
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public RequestedTimeOff() {}

    public RequestedTimeOff(LocalDate startDate, LocalDate endDate, Type type, String notes, Employee employee){
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.notes = notes;
        this.approved = false;
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

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getApproved() {
        return this.approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
