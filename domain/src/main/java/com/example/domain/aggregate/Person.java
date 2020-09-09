package com.example.domain.aggregate;

import com.example.domain.entity.ContactInformation;
import com.example.domain.entity.Role;

import java.util.Date;

public class Person {

    private String id;
    private String name;
    private Date birthDate;
    private ContactInformation contactInformation;
    private Location location;
    private AuthInformation authInformation;

    public Person(String id, String name, String phone, Role role) {

        if (isNull(id) || isNull(name) || isNull(phone) || isNull(role)){
            //throw Exception
        }
        else {
            this.id = id;
            this.name = name;
            this.contactInformation = new ContactInformation(phone);
            this.authInformation = new AuthInformation(role);
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

    private boolean isNull(Object objectToEvaluate) {

        return objectToEvaluate == null;
    }
}
