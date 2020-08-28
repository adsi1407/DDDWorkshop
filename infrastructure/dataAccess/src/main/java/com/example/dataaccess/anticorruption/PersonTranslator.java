package com.example.dataaccess.anticorruption;

import com.example.dataaccess.dto.PersonDto;
import com.example.domain.aggregate.Person;
import com.example.domain.entity.Role;

import java.util.ArrayList;
import java.util.List;

public class PersonTranslator {

    public PersonDto fromDomainToDto(Person person) {

        PersonDto personDto = new PersonDto();
        personDto.setId(person.getId());
        personDto.setName(person.getName());
        personDto.setBirthday(person.getBirthday().toString());
        personDto.setPhone(person.getPhone());
        personDto.setEmail(person.getEmail());

        if (person.getAddress() != null) {
            personDto.setAddress(person.getAddress().getAddress());
            personDto.setCity(person.getAddress().getCity());
            personDto.setLatitude(String.valueOf(person.getAddress().getLatitude()));
            personDto.setLongitude(String.valueOf(person.getAddress().getLongitude()));
        }

        if (person.getRoles() != null) {
            List<String> roles = new ArrayList<>();

            for (int i = 0; i < person.getRoles().size(); i++) {
                Role role = person.getRoles().get(i);
                roles.add(role.getId() + "-" + role.getName());
            }
        }

        if (person.getUserInfo() != null) {
            personDto.setUserID(person.getUserInfo().getId());
            personDto.setUserPass(person.getUserInfo().getPassword());
        }

        return personDto;
    }
}
