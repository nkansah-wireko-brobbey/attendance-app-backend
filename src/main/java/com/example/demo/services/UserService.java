package com.example.demo.services;

import com.example.demo.dto.CreateUserRequest;
import com.example.demo.dto.CreateUserResponse;
import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    CreateUserResponse createUser(CreateUserRequest createUserRequest);

    List<UserDto> getAllUsers();
}
