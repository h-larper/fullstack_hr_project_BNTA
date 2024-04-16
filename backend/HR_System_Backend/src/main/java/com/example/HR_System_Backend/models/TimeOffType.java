package com.example.HR_System_Backend.models;

public enum TimeOffType {

    SICKLEAVE("Sick Leave"),
    COMPASSIONATELEAVE("Compassionate Leave"),
    PARENTALLEAVE("Parental Leave"),
    HOLIDAYLEAVE("Holiday Leave"),
    OTHER("Other");

    final String displayName;
    TimeOffType(String displayName){
        this.displayName = displayName;
    }
    
}
