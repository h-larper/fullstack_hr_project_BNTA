package com.example.HR_System_Backend.models;

public class LoginDTO {

    private String workEmail;

    private String password;

    public LoginDTO() {
    }

    public LoginDTO(String workEmail, String password) {
        this.workEmail = workEmail;
        this.password = password;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
