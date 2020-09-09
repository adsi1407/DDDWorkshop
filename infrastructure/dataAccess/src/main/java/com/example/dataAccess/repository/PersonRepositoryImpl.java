package com.example.dataAccess.repository;

import com.example.domain.aggregate.Person;
import com.example.domain.repository.PersonRepository;

public class PersonRepositoryImpl implements PersonRepository {

    @Override
    public boolean personExists(String id) {
        return false;
    }

    @Override
    public void savePerson(Person person) {

    }
}
