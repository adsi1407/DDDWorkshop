package com.example.application.exception;

public class ConnectivityException extends RuntimeException {

    private static final String NO_INTERNET_CONNECTION_MESSAGE = "No hay conexión a internet. Intenta más tarde.";

    public ConnectivityException() {
        super(NO_INTERNET_CONNECTION_MESSAGE);
    }
}
