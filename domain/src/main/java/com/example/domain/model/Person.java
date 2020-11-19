package com.example.domain.model;

import java.time.LocalDate;

public class Person {

    private String dni;
    private String fullName;
    private LocalDate birthDate;
    private ContactInformation contactInformation;
    private Address address;
    private AuthUser authUser;

    public Person (String dni, String fullName, ContactInformation contactInformation, AuthUser authUser) {

        setDni(dni);
        setFullName(fullName);
    }

    public String getDni() {
        return dni;
    }

    private void setDni(String dni) {

        if(dni == null || dni == "") {
            //throw Exception
        }
        this.dni = dni;
    }

    public String getFullName() {

        if (fullName == null || fullName == "") {
            //throw Exception
        }
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AuthUser getAuthUser() {
        return authUser;
    }

    public void setAuthUser(AuthUser authUser) {
        this.authUser = authUser;
    }

}