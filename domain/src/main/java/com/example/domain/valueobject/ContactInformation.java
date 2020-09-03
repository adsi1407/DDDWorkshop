package com.example.domain.valueobject;

public class ContactInformation {

    private String phone;
    private String email;

    public ContactInformation(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (validateEmailFormat(email)) {
            this.email = email;
        }
        else {
            //throw exception
        }
    }

    private boolean validateEmailFormat(String email) {

        return true;
    }
}
