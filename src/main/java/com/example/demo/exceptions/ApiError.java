package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;

public record ApiError (String message, String code){

}
