package com.example.dddworkshop.dimodule;

import com.example.dataaccess.repository.PersonRepositoryImpl;
import com.example.domain.repository.PersonRepository;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class PersonModule {

    @Binds
    public abstract PersonRepository bindPersonRepository(PersonRepositoryImpl personRepository);
}
