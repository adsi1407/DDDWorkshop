package com.example.domain.entity;

import com.example.domain.valueobject.ContactInformation;

import java.util.Date;

public class Person {

    private String id;
    private String name;
    private Date birthDate;
    private ContactInformation contactInformation;
    private Location location;
    private AuthInformation authInformation;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public AuthInformation getAuthInformation() {
        return authInformation;
    }

    public void setAuthInformation(AuthInformation authInformation) {
        this.authInformation = authInformation;
    }
}
