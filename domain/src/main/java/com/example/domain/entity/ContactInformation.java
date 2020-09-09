package com.example.domain.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactInformation {

    private static final String EMAIL_PATTERN_STRING = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b";

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

        Pattern pattern = Pattern.compile(EMAIL_PATTERN_STRING);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
