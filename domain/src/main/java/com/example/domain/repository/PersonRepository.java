package com.example.domain.repository;

import com.example.domain.aggregate.Person;

public interface PersonRepository {

    boolean personExists(String id);

    void savePerson(Person person);
}
