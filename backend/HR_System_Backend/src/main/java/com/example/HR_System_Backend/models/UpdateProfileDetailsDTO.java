package com.example.HR_System_Backend.models;

public class UpdateProfileDetailsDTO {

    private int sortCode;

    private int accountNumber;

    public UpdateProfileDetailsDTO() {
    }

    public UpdateProfileDetailsDTO(int sortCode, int accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
