package com.example.demo.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Getter
public class AppExceptions extends RuntimeException{

    private final String message;
    private final String code;
    private final HttpStatus httpStatus;

    public AppExceptions(String message, String code, HttpStatus httpStatus){
        super(message);
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
