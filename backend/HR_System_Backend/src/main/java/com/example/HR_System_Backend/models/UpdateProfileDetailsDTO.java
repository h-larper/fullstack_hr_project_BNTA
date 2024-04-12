package com.example.HR_System_Backend.models;

public class UpdateProfileDetailsDTO {

    private String sortCode;

    private String accountNumber;

    public UpdateProfileDetailsDTO() {
    }

    public UpdateProfileDetailsDTO(String sortCode, String accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
