package com.example.demo.services;

import com.example.demo.constants.UserRole;
import com.example.demo.domain.User;
import com.example.demo.dto.CreateUserRequest;
import com.example.demo.dto.CreateUserResponse;
import com.example.demo.exceptions.DuplicateUserException;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public CreateUserResponse createUser(CreateUserRequest createUserRequest){

        Optional<User> optionalUser = userRepository.findUserByEmail(createUserRequest.getEmail());

        if (optionalUser.isPresent()){
            throw new DuplicateUserException("User Exist Already Exception");
        }

        User user = User.builder()
                .name(createUserRequest.getName())
                .role(UserRole.MEMBER)
                .email(createUserRequest.getEmail())
                .rfidUid(createUserRequest.getRfUid())
                .phone(createUserRequest.getPhone())
                .build();

        User newUser = userRepository.save(user);

        return CreateUserResponse.from(newUser);
    }

}
