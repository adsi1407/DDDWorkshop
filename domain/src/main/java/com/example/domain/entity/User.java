package com.example.domain.entity;

import com.example.domain.exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    private static final String PASSWORD_PATTERN_STRING = "^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,}$";
    private String id;
    private String password;

    public User(String id, String password) {
        this.id = id;

        if (password != null && validatePasswordFormat(password)) {
            this.password = password;
        }
        else {
            throw new WrongPasswordException();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean validatePasswordFormat(String password) {

        Pattern pattern = Pattern.compile(PASSWORD_PATTERN_STRING);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
