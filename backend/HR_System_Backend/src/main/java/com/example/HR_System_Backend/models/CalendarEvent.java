package com.example.HR_System_Backend.models;

import java.time.LocalDate;

public class CalendarEvent {

    private Long id;

    private LocalDate startDate;

    private LocalDate endDate;

    private TimeOffType timeOffType;

    private String notes;

    private String fullName;

    private Boolean isCurrentUsersEvent;

    public CalendarEvent() {
    }

    public CalendarEvent(Long id, LocalDate startDate, LocalDate endDate, TimeOffType timeOffType, String notes,
                         String fullName, Boolean isCurrentUsersEvent) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeOffType = timeOffType;
        this.notes = notes;
        this.fullName = fullName;
        this.isCurrentUsersEvent = isCurrentUsersEvent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getCurrentUsersEvent() {
        return isCurrentUsersEvent;
    }

    public void setCurrentUsersEvent(Boolean currentUsersEvent) {
        isCurrentUsersEvent = currentUsersEvent;
    }
}

