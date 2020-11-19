package com.example.dddworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dataaccess.repository.PersonRepositoryWebService;
import com.example.domain.model.AuthUser;
import com.example.domain.model.ContactInformation;
import com.example.domain.model.Person;
import com.example.domain.repository.PersonRepository;
import com.example.domain.service.PersonService;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    PersonService personService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContactInformation contactInformation = new ContactInformation("3121110011");
        Person person = new Person("01", "David", contactInformation, new AuthUser());
        personService.savePerson(person);


    }
}