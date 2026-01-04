package com.example.demo.services;

import com.example.demo.dto.CreateUserRequest;
import com.example.demo.dto.CreateUserResponse;
import org.springframework.stereotype.Service;

public interface UserService {
    CreateUserResponse createUser(CreateUserRequest createUserRequest);
}
