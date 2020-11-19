package com.example.dataaccess.repository;

import android.content.Context;

import com.example.dataaccess.anticorruption.PersonTraslator;
import com.example.dataaccess.dto.PersonDto;
import com.example.domain.model.Person;
import com.example.domain.repository.PersonRepository;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class PersonRepositoryWebService implements PersonRepository {

    private Context context;

    @Inject
    public PersonRepositoryWebService(@ApplicationContext Context context) {
        this.context = context;
    }

    @Override
    public boolean personExists(String dni) {
        return false;
    }

    @Override
    public void save(Person person) {

        PersonTraslator personTraslator = new PersonTraslator();
        PersonDto personDto = personTraslator.fromDomainToDto(person);

        //Llamar al servicio web que guarda la persona
    }
}
