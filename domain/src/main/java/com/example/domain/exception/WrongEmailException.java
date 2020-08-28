package com.example.domain.exception;

public class WrongEmailException extends RuntimeException {

    public static final String WRONG_EMAIL_MESSAGE = "El email tiene un formato incorrecto.";

    public WrongEmailException() {
        super(WRONG_EMAIL_MESSAGE);
    }
}
