package com.example.domain.exception;

public class PersonAlreadyExistsException extends RuntimeException {

    public static final String PERSON_ALREADY_EXISTS_MESSAGE = "La persona ya existe.";

    public PersonAlreadyExistsException() {
        super(PERSON_ALREADY_EXISTS_MESSAGE);
    }
}
