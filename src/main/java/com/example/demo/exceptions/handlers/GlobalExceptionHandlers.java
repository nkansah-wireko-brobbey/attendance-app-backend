package com.example.demo.exceptions.handlers;

import com.example.demo.exceptions.ApiError;
import com.example.demo.exceptions.AppExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlers {

    @ExceptionHandler(AppExceptions.class)
    ResponseEntity<ApiError> globalApiErrorHandler(AppExceptions exceptions){
        ApiError apiError = new ApiError(exceptions.getMessage(), exceptions.getCode());

        return ResponseEntity.status(exceptions.getHttpStatus()).body(apiError);
    }

    @ExceptionHandler(Exception.class)
    ResponseEntity<ApiError> interServerErrorHandler(Exception exception){
        ApiError apiError = new ApiError(exception.getMessage(), "INTERNAL_SERVER_ERROR");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiError);
    }
}
