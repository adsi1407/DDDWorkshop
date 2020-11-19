package com.example.dataaccess.anticorruption;

import com.example.dataaccess.dto.PersonDto;
import com.example.domain.model.Person;

public class PersonTraslator {

    public PersonDto fromDomainToDto(Person person) {

        PersonDto personDto = new PersonDto();

        //Mapear todos los campos de el objeto Person hacia el obteto PersonDto

        return personDto;
    }
}
