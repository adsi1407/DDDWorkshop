package com.example.domain.service;

import com.example.domain.model.Person;
import com.example.domain.repository.PersonRepository;

import javax.inject.Inject;

public class PersonService {

    private PersonRepository personRepository;

    @Inject
    public PersonService(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    public void savePerson(Person person) {

        if (personRepository.personExists(person.getDni())) {
            //throw Exception
        }
        personRepository.save(person);
    }
}
