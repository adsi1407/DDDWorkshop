package com.example.domain.service;

import com.example.domain.entity.Person;
import com.example.domain.repository.PersonRepository;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(Person person) {

        if (personRepository.personExists(person.getId())) {
            //throws exception
        }
        else {
            personRepository.savePerson(person);
        }
    }
}
