package com.example.application.service;

import com.example.application.exception.ConnectivityException;
import com.example.application.integration.Connectivity;
import com.example.domain.aggregate.Person;
import com.example.domain.service.PersonService;

import javax.inject.Inject;

public class PersonApplicationService {

    @Inject
    Connectivity connectivity;

    @Inject
    PersonService personService;

    @Inject
    public PersonApplicationService() {
    }

    public void savePerson(Person person) {

        if (connectivity.isConnected()) {
            personService.savePerson(person);
        }
        else {
            throw new ConnectivityException();
        }
    }
}
