package com.example.HR_System_Backend.models;

public class UpdateManagerDTO {

    private Long managerId;

    public UpdateManagerDTO() {}

    public UpdateManagerDTO(Long managerId) {
        this.managerId = managerId;
    }

    public Long getManagerId() {
        return this.managerId;
    }

    public void setMangerId(Long mangerId) {
        this.managerId = mangerId;
    }
}
