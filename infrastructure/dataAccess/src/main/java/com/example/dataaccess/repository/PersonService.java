package com.example.dataaccess.repository;

import com.example.dataaccess.dto.PersonDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PersonService {

    @GET("ExistsPerson")
    Call<Boolean> personExists(String id);

    @POST("SavePerson")
    Call savePerson(@Body PersonDto personDto);
}
