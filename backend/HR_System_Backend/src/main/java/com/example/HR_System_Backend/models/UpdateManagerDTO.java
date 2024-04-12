package com.example.HR_System_Backend.models;

public class UpdateManagerDTO {

    private Long mangerId;

    public UpdateManagerDTO() {}

    public UpdateManagerDTO(Long mangerId) {
        this.mangerId = mangerId;
    }

    public Long getMangerId() {
        return this.mangerId;
    }

    public void setMangerId(Long mangerId) {
        this.mangerId = mangerId;
    }
}
