package com.example.domain.repository;

import com.example.domain.model.Person;

public interface PersonRepository {

    boolean personExists(String dni);

    void save(Person person);
}
