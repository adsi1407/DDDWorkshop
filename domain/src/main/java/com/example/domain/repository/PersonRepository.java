package com.example.domain.repository;

import com.example.domain.entity.Person;

public interface PersonRepository {

    boolean personExists(String id);

    void savePerson(Person person);
}
