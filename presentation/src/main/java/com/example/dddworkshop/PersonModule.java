package com.example.dddworkshop;

import com.example.dataaccess.repository.PersonRepositoryWebService;
import com.example.domain.repository.PersonRepository;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class PersonModule {

    @Binds
    public abstract PersonRepository bindPersonRepository(PersonRepositoryWebService personRepository);
}
