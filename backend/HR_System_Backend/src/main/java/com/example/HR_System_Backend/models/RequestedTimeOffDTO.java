package com.example.HR_System_Backend.models;

import java.time.LocalDate;

public class RequestedTimeOffDTO {

    private long id;

    private LocalDate startDate;

    private LocalDate endDate;

    private TimeOffType timeOffType;

    private String notes;

    private Status status;

    private Long employeeId;

    public RequestedTimeOffDTO() {
    }

    public RequestedTimeOffDTO(long id, LocalDate startDate, LocalDate endDate, TimeOffType timeOffType, String notes, Status status, Long employeeId) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeOffType = timeOffType;
        this.notes = notes;
        this.status = status;
        this.employeeId = employeeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public TimeOffType getTimeOffType() {
        return timeOffType;
    }

    public void setTimeOffType(TimeOffType timeOffType) {
        this.timeOffType = timeOffType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
