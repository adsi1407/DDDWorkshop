package com.example.dataaccess.repository;

import com.example.dataaccess.anticorruption.PersonTranslator;
import com.example.dataaccess.dto.PersonDto;
import com.example.domain.aggregate.Person;
import com.example.domain.exception.TechnicalException;
import com.example.domain.repository.PersonRepository;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PersonRepositoryImpl implements PersonRepository {

    public static final String BASE_URL = "https://dddworkshop.free.beeceptor.com/";
    private Retrofit retrofit;

    public PersonRepositoryImpl() {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Override
    public boolean personExists(String id) {

        PersonService personService = retrofit.create(PersonService.class);
        Call<Boolean> call = personService.personExists(id);
        boolean personExists;

        try {

            Response<Boolean> response = call.execute();
            personExists = response.body();
        }
        catch(IOException ex) {
            throw new TechnicalException(ex);
        }

        return personExists;
    }

    @Override
    public void savePerson(Person person) {

        PersonDto personDto = new PersonTranslator().fromDomainToDto(person);

        PersonService personService = retrofit.create(PersonService.class);
        Call call = personService.savePerson(personDto);

        try {

            Response response = call.execute();
        }
        catch (IOException ex) {
            throw new TechnicalException(ex);
        }
    }
}
