package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;

public class DuplicateUserException extends AppExceptions{
    public DuplicateUserException(String message) {
        super(message, "DUPLICATE_USER", HttpStatus.CONFLICT);
    }
}
