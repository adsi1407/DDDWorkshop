package com.example.domain.service;

import com.example.domain.aggregate.Person;
import com.example.domain.exception.PersonAlreadyExistsException;
import com.example.domain.repository.PersonRepository;

public class CreatePersonService {

    private PersonRepository personRepository;


    public CreatePersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(Person person) {

        if (personRepository.personExists(person.getId())) {
            throw new PersonAlreadyExistsException();
        }
        else {
            personRepository.savePerson(person);
        }
    }
}
