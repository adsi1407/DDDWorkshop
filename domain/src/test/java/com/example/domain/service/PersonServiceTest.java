package com.example.domain.service;

import com.example.domain.aggregate.Person;
import com.example.domain.entity.Role;
import com.example.domain.exception.PersonAlreadyExistsException;
import com.example.domain.repository.PersonRepository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    @Mock
    PersonRepository personRepository;

    @Test
    public void savePerson_personWithCorrectParameters_successful() {

        //Arrange
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("01", "Role01"));
        Person person = new Person("01", "Person01", "3001234455", roles);

        //Act
        personRepository.savePerson(person);
    }

    @Test
    public void savePerson_personWithEmptyRoles_successful() {

        //Arrange
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("01", "Role01"));
        Person person = new Person("01", "Person01", "3001234455", roles);

        when(personRepository.personExists("01")).thenReturn(true);

        String expectedMessage = "La persona ya existe.";

        //Act
        try {
            personRepository.savePerson(person);
            Assert.fail();
        }
        catch (PersonAlreadyExistsException ex) {

            //Assert
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }
}
