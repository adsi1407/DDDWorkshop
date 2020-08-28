package com.example.domain.exception;

public class TechnicalException extends RuntimeException {

    public TechnicalException(Exception ex) {
        super(ex);
    }
}
