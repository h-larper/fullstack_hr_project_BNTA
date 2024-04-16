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

    public static TimeOffType valueOfDisplayName(String typeName){
        for (TimeOffType timeOffType : TimeOffType.values()){
            if (timeOffType.displayName.equals(typeName)){
                return timeOffType;
            }
        }
        return null;
    }
}
