package com.example.dddworkshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.example.dddworkshop.viewmodel.PersonViewModel;
import com.example.domain.aggregate.Person;
import com.example.domain.entity.Role;

import java.util.ArrayList;
import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private PersonViewModel personViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personViewModel = new ViewModelProvider(this).get(PersonViewModel.class);

        List<Role> roles = new ArrayList<>();
        roles.add(new Role("01", "Role01"));
        Person person = new Person("01", "Person01", "3001234455", roles);
        personViewModel.executeSavePerson(person).observe(this, personSaved -> {
            if (personSaved) {
                Toast.makeText(this, "Persona guardada!", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Hubo un error al guardar la persona.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}