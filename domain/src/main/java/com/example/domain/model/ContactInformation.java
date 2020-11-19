package com.example.domain.model;

public class ContactInformation {

    private String phoneNumber;
    private String email;

    public ContactInformation(String phoneNumber) {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (!validateEmail(email)) {
            //throw Exception
        }
        this.email = email;
    }

    private boolean validateEmail(String email) {
        return true;
    }
}
