package com.example.HR_System_Backend.models;

public class ApprovalDTO {

    private Status status;

    public ApprovalDTO() {
    }

    public ApprovalDTO(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
