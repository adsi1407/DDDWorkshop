package com.example.dddworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.domain.aggregate.Person;
import com.example.domain.entity.Role;
import com.example.domain.service.CreatePersonService;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    CreatePersonService createPersonService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person("01", "David", "3001112233", new Role("01", "Role01"));
        createPersonService.savePerson(person);
    }
}