package com.example.domain.exception;

public class WrongPasswordException extends RuntimeException {

    public static final String WRONG_PASSWORD_MESSAGE = "El password no tiene el formato correcto.";

    public WrongPasswordException() {
        super(WRONG_PASSWORD_MESSAGE);
    }
}
