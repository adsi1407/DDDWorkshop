package com.example.domain.entity;

import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    public static final String EMAIL_PATTERN_STRING = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b";

    private String id;
    private String name;
    private Date birthday;
    private String phone;
    private String email;
    private Address address;
    private List<Role> roles;
    private User userInfo;

    public Person (String id, String name, String phone, List<Role> roles) {
        this.id = id;
        this.name = name;
        this.phone = phone;

        if (validateAtLeastOneRole(roles)) {
            this.roles = roles;
        }
        else {
            //throws exception
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
            //throws exception
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    private boolean validateAtLeastOneRole(List<Role> roles) {
        return roles.size() > 0;
    }

    private boolean validateEmailFormat(String email) {

        Pattern pattern = Pattern.compile(EMAIL_PATTERN_STRING);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
