package com.example.domain.exception;

public class EmptyRolesException extends RuntimeException {

    public static final String EMPTY_ROLES_MESSAGE = "Debe tener al menos un rol.";

    public  EmptyRolesException() {
        super(EMPTY_ROLES_MESSAGE);
    }
}
